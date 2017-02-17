package com.metrics.mq.ibm;

import javax.jms.Connection;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.metrics.TDCCMessageQueueConfig;


public class OPCMessageReceiver
{
	protected static final Logger logger = LoggerFactory.getLogger( OPCMessageReceiver.class );

	@Autowired
	@Qualifier(TDCCMessageQueueConfig.NAMED_TDCC_CONNECTION_FACTORY)
	private MQQueueConnectionFactory connectionFactory = null;
	@Qualifier(TDCCMessageQueueConfig.NAMED_OPC_RECEIVE_DESTINATION)
	@Autowired
	private MQQueue receiveOPCDestination = null;

	public String receive(String jmsMessageId) {
		String result = null;
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;
		Message message = null;

		try {
			connection = connectionFactory.createConnection();
			session = connection.createSession( false, Session.AUTO_ACKNOWLEDGE );
			consumer = session.createConsumer( receiveOPCDestination, "JMSMessageID='" + jmsMessageId + "'" );
			message = consumer.receive( 3 * 1000 );

			result = ((TextMessage) message).getText();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		} finally {
			try {
				consumer.close();
			} catch (Throwable cause) {
			}
			try {
				session.close();
			} catch (Throwable cause) {
			}
			try {
				connection.close();
			} catch (Throwable cause) {
			}
		}
		
		return result;
	}
}
