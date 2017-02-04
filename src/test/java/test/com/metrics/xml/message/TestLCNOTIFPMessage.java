package test.com.metrics.xml.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.metrics.xml.def.LCNOTIFP;
import com.metrics.xml.message.request.LCNOTIFPMessage;


/**
 * @author Ethan Lee
 */
public class TestLCNOTIFPMessage
{
	protected static final Logger logger = LoggerFactory.getLogger( TestLCNOTIFPMessage.class );

	/**
	 * Object to XML
	 */
	@Test
	public void testMarshall() {
		try {
			LCNOTIFPMessage message = new LCNOTIFPMessage();

			JAXBContext jaxbContext = JAXBContext.newInstance( message.getClass() );
			Marshaller marshaller = jaxbContext.createMarshaller();
			// output pretty printed
			marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, false );
			
			message.setORIGIN( "hello" );
			message.setBody( new LCNOTIFP() );

			Writer writer = new StringWriter();

			marshaller.marshal( message, writer );

			logger.info( writer.toString() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	/**
	 * XML to Object
	 */
	@Test
	public void testUnMarshall() {
		try {
			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"  ?><BCSSMESSAGE ORIGIN=\"hello\"><LC_NOTIFP/></BCSSMESSAGE>";

			JAXBContext jaxbContext = JAXBContext.newInstance( LCNOTIFPMessage.class );

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			LCNOTIFPMessage customer = (LCNOTIFPMessage) unmarshaller.unmarshal( new StringReader( xml ) );
			logger.info( customer.getORIGIN() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
