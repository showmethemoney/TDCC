package test.com.metrics.mq;

import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;

public class IBMMQReceiver {

	public IBMMQReceiver() {
	}

	public void receive() {
		try {
			MQQueueConnectionFactory connectionFactory = new MQQueueConnectionFactory();

			connectionFactory.setHostName("172.17.240.15");
			connectionFactory.setPort(1415);
			connectionFactory.setQueueManager("QM.ROET2");
			connectionFactory.setChannel("ROE.MRV3.CHL");
			connectionFactory.setTransportType(1);

			QueueConnection connection = connectionFactory.createQueueConnection("ubsread", "");
			Session session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			
			MQQueue destination = (MQQueue) session.createQueue("ROE.MRTXR.LQ");

			System.out.println("123 ");
			
			connection.start();

			MessageConsumer consumer = session.createConsumer(destination);
			
			consumer.setMessageListener(new MessageListener() {

				@Override
				public void onMessage(Message message) {
					try {
						System.out.println(((TextMessage) message).getText());
					} catch (Throwable cause) {
						cause.printStackTrace();
					}
				}
			});
			
			while(true){}
		} catch (Throwable cause) {
			cause.printStackTrace();
		}
	}

	public static void main(String[] args) {
		IBMMQReceiver receiver = new IBMMQReceiver();
		receiver.receive();
	}
}
