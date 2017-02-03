package test.com.metrics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.metrics.AppConfig;
import com.metrics.mq.MessageSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestMessageQueueConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( TestMessageQueueConfig.class );

	@Autowired
	MessageSender messageSender = null;

	@Test
	public void testMessageQueue() {
		try {
			Assert.assertNotNull( messageSender ); 
			
			messageSender.sendMessage( "hello world" );
			
			Thread.sleep( 10 * 1000 );
			
			
			
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
