package com.metrics.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.metrics.service.message.OXMService;
import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.opc.def.CHGKEYREQ;
import com.metrics.xml.message.opc.xml.CHGKEYREQMessage;

//@Component
public class MockJob
{
	protected static final Logger logger = LoggerFactory.getLogger( MockJob.class );
	@Autowired
	private OXMService oxmService = null;
	
	@Scheduled(cron = "${cron.opc.change.key.job}")
	public void run() {
		CHGKEYREQMessage message = new CHGKEYREQMessage();

		message.setMSGTYPE( CHGKEYREQMessage.MESSAGE_TYPE );
		message.setPRCCODE( CHGKEYREQMessage.PRC_CODE );
		message.setAUDITNO( "0000001" );
		message.setORIGIN( "B0060000" );
		message.setRSPCODE( OPCMESSAGE.RESPONSE_SUCCESS );
		
		message.setBody( new CHGKEYREQ() );
		
		logger.info( "{}", oxmService.marshallOPCMessage( message ) );
	}
}
