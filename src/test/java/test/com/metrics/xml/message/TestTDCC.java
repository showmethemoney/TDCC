package test.com.metrics.xml.message;

import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

public class TestTDCC
{
	protected static final Logger logger = LoggerFactory.getLogger( TestTDCC.class );

	@Ignore
	@Test
	public void testOPC() {
		String[] xmls = new String[] {
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T09:54:33\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000000\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"22\" REF=\"NTQPHLUMKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000007\"/></BCSSMESSAGE>123456789",
		        "<?xml version=\"1.0\" encoding=\"CNS11643\"?><!DOCTYPE BCSSMESSAGE SYSTEM \"FiscBCSS.dtd\"><BCSSMESSAGE ORIGIN=\"BCSS\" TS=\"2016-11-23T11:18:24\" BCSS_BUS_DT=\"2016-11-23\" MSG_TYPE=\"002\" SNDR_REF=\"0000000000009\" ACTION=\"LFCP\" RESEND=\"N\"><LC_NOTIFP REF_TYPE=\"24\" REF=\"HIGTVMVOKLZGD\" ST=\"ACPT\" SNDR_REF=\"1051123000002\"/></BCSSMESSAGE>", };

		Pattern p = Pattern.compile( "</BCSSMESSAGE>(.+)" );

		for (String xml : xmls) {
			Matcher m = p.matcher( xml );

			String opcCode = null;
			if (m.find()) {
				opcCode = m.group( 1 );
			}

			if (StringUtils.isNotBlank( opcCode )) {
				logger.info( "remove end : {}", StringUtils.removeEnd( xml, opcCode ) );
			}
		}
	}

	@Ignore
	@Test
	public void testParsing() {

		String[] xmls = new String[] {
		        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><BCSSMESSAGE TS=\"2017-02-15T19:19:35\" BCSS_BUS_DT=\"2017-02-15\" MSG_TYPE=\"302\" ACTION=\"RCI\"><CLOSE_REPO REF=\"99\" CNTR_ID=\"00\" CSH_AMT=\"aa\" XTR_INT=\"bb\" BNDL_REF=\"cc\" BNDL_TTL=\"dd\" CSH_SYS=\"ee\"><PRTY><STLM_PRTY PRTY_ID=\"11\" ACCT_ID=\"22\" ACCT_NM=\"33\" INVS_CSH_ACCT=\"44\"/></PRTY><CPRTY><STLM_PRTY PRTY_ID=\"55\" ACCT_ID=\"66\" ACCT_NM=\"77\" INVS_CSH_ACCT=\"88\"/></CPRTY></CLOSE_REPO></BCSSMESSAGE>" };
		try {

			for (String xml : xmls) {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();

				Document document = builder.parse( new InputSource( new StringReader( xml ) ) );

				logger.info( ((Element) document.getFirstChild().getFirstChild()).getTagName() );
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
	
	@Test
	public void testFormat() {
		logger.info( String.format( "%1$s%2$06d", "20170219", 1 ) );
	}
}
