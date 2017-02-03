package com.metrics;

import javax.jms.ConnectionFactory;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.metrics.mq.MessageReceiver;
import com.metrics.mq.mock.MockMessageReceiver;

/**
 * Message Queue Embedded Server Configuration.
 * 
 * @author ethan
 *
 */
@Configuration
public class MessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageQueueConfig.class );

	private static final String DEFAULT_BROKER_URL = "vm://localhost";

	public static final String NAMED_TDCC_MESSAGE_SENDER = "TDCCMessageSender";
	public static final String NAMED_TDCC_MESSAGE_RECEIVER = "TDCCMessageReceiver";

	public static final String NAMED_MOCK_TDCC_MESSAGE_SENDER = "MockTDCCMessageSender";
	public static final String NAMED_MOCK_TDCC_MESSAGE_RECEIVER = "MockTDCCMessageReceiver";

	private static final String NAMED_QUEUE_TDCC_REQUEST = "queue.tdcc.request";
	private static final String NAMED_QUEUE_TDCC_RESPONSE = "queue.tdcc.response";

	@Autowired
	MessageReceiver messageReceiver;

	@Autowired
	MockMessageReceiver mockMessageReceiver;

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
		// connectionFactory.setTrustedPackages( Arrays.asList( "com.websystique.spring" ) );
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
	 * JUST FOR T E S T I N G!! Message listener container, used for invoking messageReceiver.onMessage on message reception. 模擬 TDCC 收到訊息
	 */
	@Qualifier(NAMED_MOCK_TDCC_MESSAGE_RECEIVER)
	@Bean
	public MessageListenerContainer getMockContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( connectionFactory() );
		container.setDestinationName( NAMED_QUEUE_TDCC_REQUEST );
		container.setMessageListener( mockMessageReceiver );

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

	/*
	 * JUST FOR T E S T I N G!! Used for Sending Messages. 模擬 TDCC 發送訊息回去
	 */
	@Qualifier(NAMED_MOCK_TDCC_MESSAGE_SENDER)
	@Bean
	public JmsTemplate mockJmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( connectionFactory() );
		template.setDefaultDestinationName( NAMED_QUEUE_TDCC_RESPONSE );

		return template;
	}

}
