package test.com.metrics.xml.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.Marshaller;
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
import com.metrics.bean.Crit;
import com.metrics.bean.RepReq;
import com.metrics.bean.RepReqBean;
import com.metrics.xml.message.tdcc.def.REPREQ;
import com.metrics.xml.message.tdcc.xml.DEPMessage;
import com.metrics.xml.message.tdcc.xml.REPREQMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = OXMConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestOXMConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( TestOXMConfig.class );

	@Autowired
	Jaxb2Marshaller marshaller = null;

	@Test
	public void marshall() {
		try {
			RepReqBean instance = new RepReqBean();
			RepReq body = new RepReq();
			Crit crit = new Crit();
			crit.setCritnm( "" );
			crit.setCritval( " " );

			body.setCrit( crit );
			instance.setBody( body );

			REPREQMessage message = new REPREQMessage( instance );
			message.setBody( new REPREQ( instance.getBody() ) );

			Writer writer = new StringWriter();

			marshaller.marshal( message, new StreamResult( writer ) );

			logger.info( writer.toString() );

		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Ignore
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
