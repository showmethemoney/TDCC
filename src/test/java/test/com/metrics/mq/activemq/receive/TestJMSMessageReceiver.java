package test.com.metrics.mq.activemq.receive;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import test.com.metrics.TestMessageQueueConfig;

@Component
public class TestJMSMessageReceiver
{
	protected static final Logger logger = LoggerFactory.getLogger( TestJMSMessageReceiver.class );
	@Qualifier(TestMessageQueueConfig.NAMED_JMS_CONNECTION_FACTORY)
	@Autowired
	private ConnectionFactory connectionFactory = null;
	@Autowired
	private ActiveMQQueue internalOPCDestination = null;

	public String receive() {
		String result = null;
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;
		Message message = null;

		try {
			connection = connectionFactory.createConnection();
			connection.start();

			session = connection.createSession( false, Session.AUTO_ACKNOWLEDGE );
			consumer = session.createConsumer( internalOPCDestination );
			// todo timeout ?
			message = consumer.receive( 5 * 1000 );

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
