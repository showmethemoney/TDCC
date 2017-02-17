package com.metrics;

import javax.jms.QueueConnection;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;


//@Configurable
@PropertySources({ @PropertySource("classpath:OPCServer.properties") })
public class OPCMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( OPCMessageQueueConfig.class );

	public static final String NAMED_OPC_CONNECTION_FACTORY = "";
	public static final String NAMED_OPC_SEND_DESTINATION = "";
	public static final String NAMED_OPC_RECEIVE_DESTINATION = "";

	@Autowired
	Environment env = null;

	@Bean(NAMED_OPC_CONNECTION_FACTORY)
	public MQQueueConnectionFactory opcConnectionFactory() {
		MQQueueConnectionFactory connectionFactory = null;

		try {
			connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName( env.getProperty( "opc.ip" ) );
			connectionFactory.setPort( Integer.parseInt( env.getProperty( "opc.port" ) ) );
			connectionFactory.setQueueManager( env.getProperty( "opc.queueManager" ) );
			connectionFactory.setChannel( env.getProperty( "opc.channel" ) );
			connectionFactory.setTransportType( 1 );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return connectionFactory;
	}

	public UserCredentialsConnectionFactoryAdapter securityTDCCConnectionFactory() {
		UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
		adapter.setTargetConnectionFactory( opcConnectionFactory() );
		adapter.setUsername( env.getProperty( "opc.username" ) );
		adapter.setPassword( env.getProperty( "opc.password" ) );

		return adapter;
	}

	@Bean(NAMED_OPC_RECEIVE_DESTINATION)
	public MQQueue receiveOPCDestination() {
		MQQueue destination = null;

		try {
			QueueConnection connection = securityTDCCConnectionFactory().createQueueConnection();
			Session session = connection.createQueueSession( false, Session.AUTO_ACKNOWLEDGE );

			destination = (MQQueue) session.createQueue( env.getProperty( "opc.remote.queue" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}

	@Bean(NAMED_OPC_SEND_DESTINATION)
	public MQQueue sendOPCDestination() {
		MQQueue destination = null;

		try {
			destination = new MQQueue( env.getProperty( "opc.remote.queue" ), env.getProperty( "opc.remote.queue" ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return destination;
	}
}
