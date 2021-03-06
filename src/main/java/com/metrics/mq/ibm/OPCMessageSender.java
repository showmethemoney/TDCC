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
import com.metrics.OPCMessageQueueConfig;
import com.metrics.TDCCMessageQueueConfig;

@Component
public class OPCMessageSender
{
	protected static final Logger logger = LoggerFactory.getLogger( OPCMessageSender.class );
	@Qualifier(TDCCMessageQueueConfig.NAMED_OPC_MESSAGE_SENDER)
	@Autowired
	private JmsTemplate jmsOPCTemplate = null;
	@Qualifier(TDCCMessageQueueConfig.NAMED_OPC_SEND_DESTINATION)
	@Autowired
	private MQQueue sendOPCDestination = null;

	public void send(final String context) throws JmsException, JMSException {
//		logger.info( "will send to IBM MQ : {}", context );

		jmsOPCTemplate.send( sendOPCDestination, new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage();

				message.setText( context );

				return message;
			}
		} );
	}
}
