package com.metrics;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.metrics.mq.mock.MockMessageReceiver;

@Configuration
public class MockMessageQueueConfig
{
	@Autowired
	ConnectionFactory connectionFactory;

	@Autowired
	MockMessageReceiver mockMessageReceiver;

	public static final String NAMED_MOCK_TDCC_MESSAGE_SENDER = "MockTDCCMessageSender";
	public static final String NAMED_MOCK_TDCC_MESSAGE_RECEIVER = "MockTDCCMessageReceiver";

	/*
	 * JUST FOR T E S T I N G!! Message listener container, used for invoking messageReceiver.onMessage on message reception. 璅⊥ TDCC ��閮
	 */
	@Qualifier(NAMED_MOCK_TDCC_MESSAGE_RECEIVER)
	@Bean
	public MessageListenerContainer getMockContainer() {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setConnectionFactory( connectionFactory );
		container.setDestinationName( MessageQueueConfig.NAMED_QUEUE_TDCC_REQUEST );
		container.setMessageListener( mockMessageReceiver );

		return container;
	}

	/*
	 * JUST FOR T E S T I N G!! Used for Sending Messages. 璅⊥ TDCC �����
	 */
	@Qualifier(NAMED_MOCK_TDCC_MESSAGE_SENDER)
	@Bean
	public JmsTemplate mockJmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory( connectionFactory );
		template.setDefaultDestinationName( MessageQueueConfig.NAMED_QUEUE_TDCC_RESPONSE );

		return template;
	}
}
