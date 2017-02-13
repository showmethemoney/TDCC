package test.com.metrics.xml.message;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestBcssMessage
{
	protected static final Logger logger = LoggerFactory.getLogger( TestBcssMessage.class );

	@Test
	public void testDateFormat() {
		Calendar calendar = Calendar.getInstance();

		logger.info( DateFormatUtils.format( calendar, "yyyy-MM-dd'T'HH:mm:ss" ) );
	}
}
