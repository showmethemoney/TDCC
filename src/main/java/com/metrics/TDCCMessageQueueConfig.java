package com.metrics;

import javax.jms.QueueConnection;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
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
import com.metrics.mq.ibm.TDCCMessageReceiver;


/**
 * @author Ethan Lee
 */
@Configurable
@PropertySources({ @PropertySource("classpath:TDCCServer.properties") })
public class TDCCMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( TDCCMessageQueueConfig.class );
	public static final String NAMED_TDCC_CONNECTION_FACTORY = "TDCCConnectionFactory";
	public static final String NAMED_OPC_SEND_DESTINATION = "OPCSendDestination";
	public static final String NAMED_TDCC_SEND_DESTINATION = "TDCCSendDestination";
	public static final String NAMED_TDCC_RECEIVE_DESTINATION = "TDCCReceiveDestination";
	public static final String NAMED_OPC_MESSAGE_SENDER = "OPCJMSMessageSender";
	public static final String NAMED_TDCC_MESSAGE_SENDER = "TDCCJMSMessageSender";
	public static final String NAMED_TDCC_MESSAGE_RECEIVER = "TDCCJMSMessageReceiver";

	@Autowired
	Environment env = null;
	@Autowired
	TDCCMessageReceiver messageReceiver = null;

	@Bean(NAMED_TDCC_CONNECTION_FACTORY)
	public MQQueueConnectionFactory tdccConnectionFactory() {
		MQQueueConnectionFactory connectionFactory = null;

		try {
			connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName( env.getProperty( "queue.server.ip" ) );
			connectionFactory.setPort( Integer.parseInt( env.getProperty( "queue.server.port" ) ) );
			connectionFactory.setQueueManager( env.getProperty( "queue.queueManager" ) );
			connectionFactory.setChannel( env.getProperty( "queue.channel" ) );
			connectionFactory.setTransportType( 1 );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return connectionFactory;
	}

//	public UserCredentialsConnectionFactoryAdapter securityTDCCConnectionFactory() {
//		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
//		adapter.setTargetConnectionFactory( tdccConnectionFactory() );
//		adapter.setUsername( env.getProperty( "tdcc.username" ) );
//		adapter.setPassword( env.getProperty( "tdcc.password" ) );
//
//		return adapter;
//	}

	@Bean(NAMED_TDCC_RECEIVE_DESTINATION)
	public MQQueue receiveTDCCDestination() {
		MQQueue destination = null;

		try {
			QueueConnection connection = tdccConnectionFactory().createQueueConnection();
			Session session = connection.createQueueSession( false, Session.AUTO_ACKNOWLEDGE );

			destination = (MQQueue) session.createQueue( env.getProperty( "queue.tdcc.to.tbc" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean(NAMED_OPC_SEND_DESTINATION)
	public MQQueue sendOPCDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( env.getProperty( "queue.queueManager" ), env.getProperty( "queue.tbc.to.opc" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}
	
	@Bean(NAMED_TDCC_SEND_DESTINATION)
	public MQQueue sendTDCCDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( env.getProperty( "queue.queueManager" ), env.getProperty( "queue.tbc.to.tdcc" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}


	@Bean(NAMED_TDCC_MESSAGE_SENDER)
	public JmsTemplate jmsTDCCTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( tdccConnectionFactory() );
		template.setDefaultDestination( sendTDCCDestination() );

		return template;
	}
	
	@Bean(NAMED_OPC_MESSAGE_SENDER)
	public JmsTemplate jmsOPCTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( tdccConnectionFactory() );
		template.setDefaultDestination( sendOPCDestination() );

		return template;
	}

	/**
	 * 接收 OPCMessage 與 BCSSMessage
	 * 若為 OPCMessage 則，再丟到 MessageQueueConfig 在由 OPCMessageReceiver 收
	 * @return
	 */
	@Bean
	public MessageListenerContainer getContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( tdccConnectionFactory() );
		container.setDestination( receiveTDCCDestination() );
		container.setMessageListener( messageReceiver );

		return container;
	}
}
