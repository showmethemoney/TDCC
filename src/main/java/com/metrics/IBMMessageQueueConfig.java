package com.metrics;

import javax.jms.QueueConnection;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.metrics.mq.ibm.MessageReceiver;


/**
 * @author Ethan Lee
 */
@Configurable
public class IBMMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( IBMMessageQueueConfig.class );
	@Autowired
	MessageReceiver messageReceiver = null;

	@Bean
	public MQQueueConnectionFactory connectionFactory() {
		MQQueueConnectionFactory connectionFactory = null;

		try {
			connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName( "172.17.240.15" );
			connectionFactory.setPort( 1415 );
			connectionFactory.setQueueManager( "QM.ROET2" );
			connectionFactory.setChannel( "ROE.MRV3.CHL" );
			connectionFactory.setTransportType( 1 );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return connectionFactory;
	}

	public UserCredentialsConnectionFactoryAdapter securityConnectionFactory() {
		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
		adapter.setTargetConnectionFactory( connectionFactory() );
		adapter.setUsername( "ubsread" );
		adapter.setPassword( "" );

		return adapter;
	}

	@Bean
	public MQQueue receiveDestination() {
		MQQueue destination = null;

		try {
			QueueConnection connection = securityConnectionFactory().createQueueConnection();
			Session session = connection.createQueueSession( false, Session.AUTO_ACKNOWLEDGE );

			destination = (MQQueue) session.createQueue( "ROE.MRTXR.LQ" );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean
	public MQQueue sendDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( "QM.ROET2", "ROE.MRTXR.LQ" );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( securityConnectionFactory() );
		template.setDefaultDestination( sendDestination() );

		return template;
	}

	@Bean
	public MessageListenerContainer getContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( securityConnectionFactory() );
		container.setDestination( receiveDestination() );
		container.setMessageListener( messageReceiver );

		return container;
	}
}
