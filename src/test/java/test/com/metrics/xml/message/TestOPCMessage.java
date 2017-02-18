package test.com.metrics.xml.message;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.metrics.AppConfig;
import com.metrics.service.message.OXMService;
import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.CHGKEYREQ;
import com.metrics.xml.message.opc.xml.CHGKEYMessage;
import com.metrics.xml.message.opc.xml.CHGKEYREQMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class TestOPCMessage
{
	protected static final Logger logger = LoggerFactory.getLogger( TestOPCMessage.class );

	@Autowired
	private OXMService oxmService = null;

	@Test
	public void testMarshall() {
		try {
			CHGKEYREQMessage message = new CHGKEYREQMessage();

			message.setMSGTYPE( CHGKEYREQMessage.MESSAGE_TYPE );
			message.setPRCCODE( CHGKEYREQMessage.PRC_CODE );
			message.setAUDITNO( "0000001" );
			message.setORIGIN( "B0060000" );
			message.setRSPCODE( OPCMESSAGE.RESPONSE_SUCCESS );
			
			message.setBody( new CHGKEYREQ() );
			
			logger.info( "{}", oxmService.marshallOPCMessage( message ) );
			
			while(true) {}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	@Ignore
	@Test
	public void testUnMarshall() {
		try {
			String result = "<?xml version = \"1.0\" encoding = \"UTF-8\"?><OPCMESSAGE MSG_TYPE=\"0100\" PRC_CODE=\"0102\" AUDIT_NO=\"0000001\" ORIGIN=\"B0060000\" TS=\"20161123085013\" RSP_CODE=\"0001\"><CHG_KEY KEY_ID=\"02\" NEW_KEY=\"7B111F157B396BAF80EC30A0071A47B6\" RANDOM_NO=\"B6E9BC3BA229C61D\"/></OPCMESSAGE>";

			CHGKEYMessage message = oxmService.unMarshallOPCMessage( new CHGKEYMessage(), result );

			logger.info( "{} {}", message.getMSGTYPE(), message.getPRCCODE() );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
