package com.metrics.mq.mock;

import java.util.Calendar;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.metrics.MockMessageQueueConfig;

@Component
public class MockMessageReceiver implements MessageListener
{
	protected static final Logger logger = LoggerFactory.getLogger( MockMessageReceiver.class );

	@Qualifier(MockMessageQueueConfig.NAMED_MOCK_TDCC_MESSAGE_SENDER)
	@Autowired
	JmsTemplate jmsTemplate;

	@Override
	public void onMessage(final Message message) {
		try {
			logger.info( "TDCC Receive : {}", ((TextMessage) message).getText() );
			
			
			jmsTemplate.send( new MessageCreator() {
				@Override
				public Message createMessage(Session session) throws JMSException {
					String response = Calendar.getInstance().getTimeInMillis() + " " + ((TextMessage) message).getText();
					logger.info( "TDCC Will response : {}", response );
					return session.createTextMessage( response );
				}
			} );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
