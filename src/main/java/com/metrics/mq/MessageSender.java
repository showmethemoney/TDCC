package com.metrics.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.metrics.MessageQueueConfig;

/**
 * send message to tdcc
 * 
 * @author ethan
 *
 */
@Component
public class MessageSender
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageSender.class );

	@Qualifier(MessageQueueConfig.NAMED_TDCC_MESSAGE_SENDER)
	@Autowired
	JmsTemplate jmsTemplate;

	public void sendMessage(final String content) {
		try {
			logger.info( "send to TDCC : {}", content );
			
			jmsTemplate.send( new MessageCreator() {
				@Override
				public Message createMessage(Session session) throws JMSException {
					return session.createTextMessage( content );
				}
			} );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
