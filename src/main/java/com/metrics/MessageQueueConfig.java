package com.metrics;

import javax.jms.ConnectionFactory;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

/**
 * Message Queue Embedded Server Configuration. ActiveMQ
 * 
 * ibm mq : http://ciruk.pl/2015/04/connecting-to-ibm-mq-with-spring-boot-and-jms/
 * 
 * @author ethan
 *
 */
@Configuration
public class MessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageQueueConfig.class );

	private static final String DEFAULT_BROKER_URL = "vm://localhost";

	public static final String NAMED_JMS_CONNECTION_FACTORY = "JMSConnectionFactory";
	public static final String NAMED_QUEUE_INTERNAL_OPC = "queue.internal.opc";
//	public static final String NAMED_QUEUE_JMS_REQUEST = "queue.opc.request";
//	public static final String NAMED_QUEUE_JMS_RESPONSE = "queue.opc.response";
	public static final String NAMED_JMS_MESSAGE_SENDER = "JMSMessageSender";
	public static final String NAMED_JMS_MESSAGE_RECEIVER = "JMSMessageReceiver";

	// @Qualifier(NAMED_JMS_MESSAGE_RECEIVER)
	// @Autowired
	// MessageReceiver messageReceiver;

	/**
	 * Embedded MQ Server
	 */
	@Bean(initMethod = "start", destroyMethod = "stop")
	public BrokerService embeddedBroker() {
		BrokerService broker = null;

		try {
			broker = new BrokerService();

			// configure the broker
			broker.addConnector( DEFAULT_BROKER_URL );
			broker.setPersistent( false );
			broker.setUseJmx( false );
			broker.setUseShutdownHook( false );

		} catch (Throwable cause) {
			logger.error( cause.getMessage() );
		}

		return broker;
	}

	@Bean(NAMED_JMS_CONNECTION_FACTORY)
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL( DEFAULT_BROKER_URL );

		return connectionFactory;
	}
	
	@Bean
	public ActiveMQQueue internalOPCDestination() {
		return new ActiveMQQueue( NAMED_QUEUE_INTERNAL_OPC );
	}
	
	/*
	 * Message listener container, used for invoking messageReceiver.onMessage on message reception.
	 */
	// @Qualifier(NAMED_JMS_MESSAGE_RECEIVER)
	// @Bean
	// public MessageListenerContainer getContainer() {
	// DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
	// container.setConnectionFactory( connectionFactory() );
	// container.setDestinationName( NAMED_QUEUE_JMS_RESPONSE );
	// container.setMessageListener( messageReceiver );
	//
	// return container;
	// }

	/*
	 * Used for Sending Messages.
	 */
	@Bean(NAMED_JMS_MESSAGE_SENDER)
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( connectionFactory() );
//		template.setDefaultDestinationName( NAMED_QUEUE_INTERNAL_OPC );
		template.setDefaultDestination( internalOPCDestination() );

		return template;
	}

}
