package com.metrics.mq.ibm;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component("IBMMessageReceiver")
public class IBMMessageReceiver implements MessageListener
{
	protected static final Logger logger = LoggerFactory.getLogger( IBMMessageReceiver.class );

	@Override
	public void onMessage(Message message) {
		try {
			logger.info( "receiv message from IBM MQ : {}", ((TextMessage) message).getText() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
