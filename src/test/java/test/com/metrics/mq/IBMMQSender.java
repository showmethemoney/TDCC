package test.com.metrics.mq;

import java.util.Calendar;

import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;

public class IBMMQSender {

	public IBMMQSender() {
	}

	public static void main(String[] args) {
		IBMMQSender sender = new IBMMQSender();

		sender.send();
	}

	public void send() {
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

			while (true) {
				TextMessage message = session.createTextMessage();
				message.setText(Long.toString(Calendar.getInstance().getTimeInMillis()));

				producer.send(message, Message.DEFAULT_DELIVERY_MODE, Message.DEFAULT_PRIORITY,
						Message.DEFAULT_TIME_TO_LIVE);
				// sleep 10 sec
				Thread.sleep(5 * 1000);
			}

		} catch (Throwable cause) {
			cause.printStackTrace();
		}
	}
}
