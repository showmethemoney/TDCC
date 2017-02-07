package test.com.metrics.xml.message;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

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
import com.metrics.xml.message.tdcc.def.DEP;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

/**
 * @author Ethan Lee
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestDEPMessage
{
	protected static final Logger logger = LoggerFactory.getLogger( TestDEPMessage.class );
	@Qualifier("tdccMessages")
	@Autowired
	MapFactoryBean tdccMessages = null;

	/**
	 * Object to XML
	 */
	@Ignore
	@Test
	public void testMarshall() {
		try {
			DEPMessage message = new DEPMessage();

			JAXBContext jaxbContext = JAXBContext.newInstance( message.getClass() );
			Marshaller marshaller = jaxbContext.createMarshaller();
			// output pretty printed
			marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, false );

			message.setORIGIN( "hello" );
			message.setBody( new DEP() );

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
//	@Test
//	public void testUnMarshall() {
//		try {
//			String xml = "<?xml version = \"1.0\" encoding=\"CNS11643\"?><BCSSMESSAGE MSG_TYPE=\"101\" ACTION=\"DI\" ORIGIN=\"B0060000\" TS=\"2016-11-23T09:31:54\" SNDR_REF=\"1051123000005\" BCSS_BUS_DT=\"2016-11-23\"><DEP ISIN=\"006000009227\" ISS_TYPE=\"2\" ISSR_NM=\"�銴翩���?餈餉布��" ISSR_ID=\"285840**\" ISSR_BUS_CODE=\"012511\" ISSR_GRP_ID=\"2\" PRTY_ID=\"B0060000\" PSDB_ID=\"P0060000\" BRNCH_ID=\"0065078\" FVAL=\"3000000\" ISS_DAYS=\"180\" ISS_DT=\"2016-11-25\" DEP_DT=\"2016-11-23\" SELL_DT=\"2016-11-25\" MAT_DT=\"2017-05-24\" TH_MAT_DT=\"2017-05-24\"><DENOMINATION ID=\"300\" FVAL=\"3000000\" UVAL=\"3000000\" UNITS=\"1\" /><AGREER AGR_ID=\"0060327\" AGRM_REF=\"006000009227\" /><ENDORSEE END_ID=\"\" END_ADDR=\"\" /></DEP></BCSSMESSAGE>";
//
//			Class clazz = (Class) tdccMessages.getObject().get( "DEP" );
//
//			logger.info( clazz.getName() );
//
//			JAXBContext jaxbContext = JAXBContext.newInstance( clazz );
//
//			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//			DEPMessage customer = (DEPMessage) unmarshaller.unmarshal( new StringReader( xml ) );
//			logger.info( customer.getORIGIN() );
//		} catch (Throwable cause) {
//			logger.error( cause.getMessage(), cause );
//		}
//	}
}
