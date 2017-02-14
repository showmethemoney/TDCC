package com.metrics;

import javax.jms.ConnectionFactory;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.metrics.mq.MessageReceiver;


/**
 * Message Queue Embedded Server Configuration. ActiveMQ
 * 
 * ibm mq : http://ciruk.pl/2015/04/connecting-to-ibm-mq-with-spring-boot-and-jms/
 * 
 * @author ethan
 *
 */
// @Configuration
public class MessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageQueueConfig.class );

	private static final String DEFAULT_BROKER_URL = "vm://localhost";

	public static final String NAMED_TDCC_MESSAGE_SENDER = "TDCCMessageSender";
	public static final String NAMED_TDCC_MESSAGE_RECEIVER = "TDCCMessageReceiver";

	public static final String NAMED_QUEUE_TDCC_REQUEST = "queue.tdcc.request";
	public static final String NAMED_QUEUE_TDCC_RESPONSE = "queue.tdcc.response";

	@Qualifier("JMSMessageReceiver")
	@Autowired
	MessageReceiver messageReceiver;

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

	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL( DEFAULT_BROKER_URL );

		return connectionFactory;
	}

	/*
	 * Message listener container, used for invoking messageReceiver.onMessage on message reception.
	 */
	@Qualifier(NAMED_TDCC_MESSAGE_RECEIVER)
	@Bean
	public MessageListenerContainer getContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( connectionFactory() );
		container.setDestinationName( NAMED_QUEUE_TDCC_RESPONSE );
		container.setMessageListener( messageReceiver );

		return container;
	}

	/*
	 * Used for Sending Messages.
	 */
	@Qualifier(NAMED_TDCC_MESSAGE_SENDER)
	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( connectionFactory() );
		template.setDefaultDestinationName( NAMED_QUEUE_TDCC_REQUEST );

		return template;
	}

}
