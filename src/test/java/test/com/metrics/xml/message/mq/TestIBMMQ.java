package test.com.metrics.xml.message.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;


/**
 * @author Ethan Lee
 */
public class TestIBMMQ
{
	protected static final Logger logger = LoggerFactory.getLogger( TestIBMMQ.class );

	@Test
	public void testByCode() {
		try {
			MQQueueConnectionFactory connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName("172.17.240.15");
			connectionFactory.setPort(1415);
			connectionFactory.setQueueManager("QM.ROET2");
			connectionFactory.setChannel("ROE.MRV3.CHL");
			connectionFactory.setTransportType(1);

			QueueConnection connection = connectionFactory.createQueueConnection("ubsread", "");
			Session session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

			MQQueue destination = new MQQueue("QM.ROET2", "ROE.MRTXR.LQ");

			MessageProducer producer = session.createProducer(destination);

			TextMessage message = session.createTextMessage();
			message.setText("Hello World");

			producer.send(message, Message.DEFAULT_DELIVERY_MODE, Message.DEFAULT_PRIORITY,
					Message.DEFAULT_TIME_TO_LIVE);

		} catch (Throwable cause) {
			cause.printStackTrace();
		}
	}

	/**
	 * D:\Program Files (x86)\IBM\WebSphere MQ\java\lib\mqjbnd.dll
	 */
	@Ignore
	@Test
	public void testIBMMQ() {
		try {
			MQQueueConnectionFactory connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName( "172.17.240.15" );
			connectionFactory.setPort( 1415 );
			connectionFactory.setQueueManager( "QM.ROET2" );
			connectionFactory.setChannel( "ROE.MRV3.CHL" );
			connectionFactory.setTransportType( 1 );

			CachingConnectionFactory cached = new CachingConnectionFactory();
			cached.setTargetConnectionFactory( connectionFactory );

			MQQueue destination = new MQQueue( "QM.ROET2", "ROE.MRTXR.LQ" );

			JmsTemplate template = new JmsTemplate();
			template.setConnectionFactory( cached );
			template.setPubSubDomain( false );
			template.setDefaultDestination( destination );

			template.send( new MessageCreator() {
				@Override
				public Message createMessage(Session session) throws JMSException {
					return session.createTextMessage( "Hello World~~" );
				}
			} );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
