package test.com.metrics.mq.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.com.metrics.TestMessageQueueConfig;
import test.com.metrics.mq.activemq.receive.TestJMSMessageReceiver;
import test.com.metrics.mq.activemq.send.TestJMSMessageSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestMessageQueueConfig.class)
public class TestActiveMQ
{
	protected static final Logger logger = LoggerFactory.getLogger( TestActiveMQ.class );
	@Autowired
	private TestJMSMessageReceiver receiver = null;
	@Autowired
	private TestJMSMessageSender sender = null;

	@Test
	public void testActiveMQ() {
		try {
			sender.send( "Hello World ~~~" );

			Thread.sleep( 5 * 1000 );

			logger.info( "receive : {} ", receiver.receive() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
