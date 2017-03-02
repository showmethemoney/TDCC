package com.metrics.mq.ibm;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.ibm.mq.jms.MQQueue;
import com.metrics.TDCCMessageQueueConfig;
import com.metrics.mq.MessageSender;


@Component("TDCCMessageSender")
public class TDCCMessageSender implements MessageSender
{
	protected static final Logger logger = LoggerFactory.getLogger( TDCCMessageSender.class );
	@Qualifier(TDCCMessageQueueConfig.NAMED_TDCC_MESSAGE_SENDER)
	@Autowired
	private JmsTemplate jmsTDCCTemplate = null;
	@Qualifier(TDCCMessageQueueConfig.NAMED_TDCC_SEND_DESTINATION)
	@Autowired
	private MQQueue sendTDCCDestination = null;

	public void send(final String context) throws JmsException, JMSException {
		logger.info( "will send to IBM MQ : {}", context );

		jmsTDCCTemplate.send( sendTDCCDestination, new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage();
				message.setText( context );

				return message;
			}
		} );
	}
}
