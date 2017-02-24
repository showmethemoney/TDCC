package com.metrics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Deprecated
//@Configurable
//@PropertySources({ @PropertySource("classpath:OPCServer.properties") })
public class OPCMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( OPCMessageQueueConfig.class );

//	public static final String NAMED_OPC_CONNECTION_FACTORY = "OPCConnectionFactory";
//	public static final String NAMED_OPC_SECURITY_CONNECTION_FACTORY = "OPCSecurityConnectionFactory";
//	public static final String NAMED_OPC_SEND_DESTINATION = "OPCSendDestination";
//	public static final String NAMED_OPC_RECEIVE_DESTINATION = "OPCReceiveDestination";
//	public static final String NAMED_OPC_MESSAGE_SENDER = "OPCMessageSender";
//	public static final String NAMED_OPC_MESSAGE_RECEIVER = "OPCMessageReceiver";
	
//	@Autowired
//	Environment env = null;
//
//	@Bean(NAMED_OPC_CONNECTION_FACTORY)
//	public MQQueueConnectionFactory opcConnectionFactory() {
//		MQQueueConnectionFactory connectionFactory = null;
//
//		try {
//			connectionFactory = new MQQueueConnectionFactory();
//
//			connectionFactory.setHostName( env.getProperty( "opc.ip" ) );
//			connectionFactory.setPort( Integer.parseInt( env.getProperty( "opc.port" ) ) );
//			connectionFactory.setQueueManager( env.getProperty( "opc.queueManager" ) );
//			connectionFactory.setChannel( env.getProperty( "opc.channel" ) );
//			connectionFactory.setTransportType( 1 );
//		} catch (Throwable cause) {
//			logger.error( cause.getMessage(), cause );
//		}
//
//		return connectionFactory;
//	}
//
//	@Bean(NAMED_OPC_SECURITY_CONNECTION_FACTORY)
//	public UserCredentialsConnectionFactoryAdapter securityOPConnectionFactory() {
//		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
//		adapter.setTargetConnectionFactory( opcConnectionFactory() );
//		adapter.setUsername( env.getProperty( "opc.username" ) );
//		adapter.setPassword( env.getProperty( "opc.password" ) );
//
//		return adapter;
//	}
//
//	@Bean(NAMED_OPC_RECEIVE_DESTINATION)
//	public MQQueue receiveOPCDestination() {
//		MQQueue destination = null;
//
//		try {
//			QueueConnection connection = securityOPConnectionFactory().createQueueConnection();
//			Session session = connection.createQueueSession( false, Session.AUTO_ACKNOWLEDGE );
//
//			destination = (MQQueue) session.createQueue( env.getProperty( "opc.remote.queue" ) );
//		} catch (Throwable cause) {
//			logger.error( cause.getMessage(), cause );
//		}
//
//		return destination;
//	}
//
//	@Bean(NAMED_OPC_SEND_DESTINATION)
//	public MQQueue sendOPCDestination() {
//		MQQueue destination = null;
//
//		try {
//			destination = new MQQueue( env.getProperty( "opc.queueManager" ), env.getProperty( "opc.local.queue" ) );
//		} catch (Throwable cause) {
//			logger.error( cause.getMessage(), cause );
//		}
//
//		return destination;
//	}
//	
//	@Bean(NAMED_OPC_MESSAGE_SENDER)
//	public JmsTemplate jmsTemplate() {
//		JmsTemplate template = new JmsTemplate();
//		template.setConnectionFactory( securityOPConnectionFactory() );
//		template.setDefaultDestination( sendOPCDestination() );
//
//		return template;
//	}
}
