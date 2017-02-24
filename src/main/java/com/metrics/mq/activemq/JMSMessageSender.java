package com.metrics.mq.activemq;

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
import com.metrics.mq.MessageSender;

/**
 * send message to tdcc
 * 
 * @author ethan
 *
 */
@Component
public class JMSMessageSender implements MessageSender
{
	protected static final Logger logger = LoggerFactory.getLogger( JMSMessageSender.class );
	@Qualifier(MessageQueueConfig.NAMED_JMS_MESSAGE_SENDER)
	@Autowired
	JmsTemplate jmsTemplate;

	public void send(final String content) {
		try {
			logger.info( "send to jms : {}", content );

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
