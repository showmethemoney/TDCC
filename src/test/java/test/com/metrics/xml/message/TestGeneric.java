package test.com.metrics.xml.message;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.xml.CLOSEREPOMessage;

public class TestGeneric
{
	protected static final Logger logger = LoggerFactory.getLogger( TestGeneric.class );

	@Test
	public void testXX() {
		CLOSEREPOMessage message = new CLOSEREPOMessage();

		print( message );
	}

	protected void print(BCSSMESSAGE message) {
		logger.info( "{}", message.getClass().getName() );
		logger.info( "{}", message.toString() );
	}
}
