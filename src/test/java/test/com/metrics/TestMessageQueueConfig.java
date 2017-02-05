package test.com.metrics;

import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.MapFactoryBean;
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
	@Qualifier("tdccMessages")
	@Autowired
	MapFactoryBean tdccMessages = null;

	@Ignore
	@Test
	public void testMessageQueue() {
		try {
			Assert.assertNotNull( messageSender );

			messageSender.sendMessage( "hello world" );

			Map<Object, Object> result = tdccMessages.getObject();

			logger.info( "{}", result.size() );
			for (Iterator<Object> iter = result.keySet().iterator(); iter.hasNext();) {
				logger.info( (String) iter.next() );
			}

			Thread.sleep( 10 * 1000 );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
