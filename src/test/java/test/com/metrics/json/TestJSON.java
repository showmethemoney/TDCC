package test.com.metrics.json;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.metrics.xml.message.tdcc.xml.DEPMessage;


/**
 * @author Ethan Lee
 */
public class TestJSON
{
	protected static final Logger logger = LoggerFactory.getLogger( TestJSON.class );

	@Test
	public void testGSON() {
		try {
			Gson gson = new Gson();
			
			DEPMessage message = new DEPMessage();
			
			message.setACTION( "123" );
			message.setORIGIN( "BCSSMessage" );
			
			logger.info( gson.toJson( message ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
