package com.metrics;

import javax.jms.QueueConnection;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.metrics.mq.MessageReceiver;


/**
 * @author Ethan Lee
 */
// @Configurable
@PropertySources({ @PropertySource("classpath:TDCCServer.properties") })
public class TDCCMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( TDCCMessageQueueConfig.class );
	public static final String NAMED_TDCC_CONNECTION_FACTORY = "";
	public static final String NAMED_TDCC_SEND_DESTINATION = "";
	public static final String NAMED_TDCC_RECEIVE_DESTINATION = "";

	@Autowired
	Environment env = null;
	@Qualifier("IBMMessageReceiver")
	@Autowired
	MessageReceiver messageReceiver = null;

	@Bean(NAMED_TDCC_CONNECTION_FACTORY)
	public MQQueueConnectionFactory tdccConnectionFactory() {
		MQQueueConnectionFactory connectionFactory = null;

		try {
			connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName( env.getProperty( "tdcc.ip" ) );
			connectionFactory.setPort( Integer.parseInt( env.getProperty( "tdcc.port" ) ) );
			connectionFactory.setQueueManager( env.getProperty( "tdcc.queueManager" ) );
			connectionFactory.setChannel( env.getProperty( "tdcc.channel" ) );
			connectionFactory.setTransportType( 1 );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return connectionFactory;
	}

	public UserCredentialsConnectionFactoryAdapter securityTDCCConnectionFactory() {
		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
		adapter.setTargetConnectionFactory( tdccConnectionFactory() );
		adapter.setUsername( env.getProperty( "tdcc.username" ) );
		adapter.setPassword( env.getProperty( "tdcc.password" ) );

		return adapter;
	}

	@Bean(NAMED_TDCC_RECEIVE_DESTINATION)
	public MQQueue receiveTDCCDestination() {
		MQQueue destination = null;

		try {
			QueueConnection connection = securityTDCCConnectionFactory().createQueueConnection();
			Session session = connection.createQueueSession( false, Session.AUTO_ACKNOWLEDGE );

			destination = (MQQueue) session.createQueue( env.getProperty( "tdcc.remote.queue" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean(NAMED_TDCC_SEND_DESTINATION)
	public MQQueue sendTDCCDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( env.getProperty( "tdcc.queueManager" ), env.getProperty( "tdcc.local.queue" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( securityTDCCConnectionFactory() );
		template.setDefaultDestination( sendTDCCDestination() );

		return template;
	}

	@Bean
	public MessageListenerContainer getContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( securityTDCCConnectionFactory() );
		container.setDestination( receiveTDCCDestination() );
		container.setMessageListener( messageReceiver );

		return container;
	}
}
