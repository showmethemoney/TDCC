package test.com.metrics.xml.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.metrics.OXMConfig;
import com.metrics.xml.message.tdcc.def.DEP;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = OXMConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestOXMConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( TestOXMConfig.class );

	@Autowired
	Jaxb2Marshaller marshaller = null;

	@Ignore
	@Test
	public void marshall() {
		try {
			DEPMessage message = new DEPMessage();

			message.setORIGIN( "hello" );

			DEP dep = new DEP();
			dep.setAMTTYPE( "123" );
			dep.setBRNCHID( "ABC" );
			dep.setCOUNTRYID( "xxx" );
			message.setBody( dep );

			Writer writer = new StringWriter();

			marshaller.marshal( message, new StreamResult( writer ) );

			logger.info( writer.toString() );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Test
	public void unmarshall() {
		try {
			Assert.assertNotNull( marshaller );
			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><BCSSMESSAGE ORIGIN=\"hello\"><DEP BRNCH_ID=\"ABC\" AMT_TYPE=\"123\" COUNTRY_ID=\"xxx\"/></BCSSMESSAGE> ";

			marshaller.setMappedClass( DEPMessage.class );
			logger.info( (marshaller.unmarshal( new StreamSource( new StringReader( xml ) ) )).toString() );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
