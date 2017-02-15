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
public class IBMMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( IBMMessageQueueConfig.class );
	public static final String NAMED_TDCC_CONNECTION_FACTORY = "";
	public static final String NAMED_TDCC_SEND_DESTINATION = "";
	public static final String NAMED_TDCC_RECEIVE_DESTINATION = "";
	public static final String NAMED_OPC_SEND_DESTINATION = "";
	public static final String NAMED_OPC_RECEIVE_DESTINATION = "";

	@Autowired
	Environment env = null;
	@Qualifier("IBMMessageReceiver")
	@Autowired
	MessageReceiver messageReceiver = null;

	@Bean(NAMED_TDCC_CONNECTION_FACTORY)
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
	
	@Bean(NAMED_OPC_RECEIVE_DESTINATION)
	public MQQueue receiveOPCDestination() {
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

	@Bean(NAMED_OPC_SEND_DESTINATION)
	public MQQueue sendOPCDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( "QM.ROET2", "ROE.MRTXR.LQ" );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean(NAMED_TDCC_SEND_DESTINATION)
	public MQQueue receiveTDCCDestination() {
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

	@Bean(NAMED_TDCC_SEND_DESTINATION)
	public MQQueue sendTDCCDestination() {
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
		template.setDefaultDestination( sendTDCCDestination() );

		return template;
	}

	@Bean
	public MessageListenerContainer getContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( securityConnectionFactory() );
		container.setDestination( receiveTDCCDestination() );
		container.setMessageListener( messageReceiver );

		return container;
	}
}
