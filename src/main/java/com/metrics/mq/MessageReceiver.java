package com.metrics.mq;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * receive message from tdcc
 * 
 * @author ethan
 *
 */
@Component
public class MessageReceiver implements MessageListener
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageReceiver.class );

	@Override
	public void onMessage(Message message) {
		try {
			logger.info( "receive from TDCC : {}", ((TextMessage) message).getText() ); 
			
			
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
