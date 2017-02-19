package com.metrics.service;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.metrics.bean.CloseRepoBean;
import com.metrics.bean.ConsigntInstBean;
import com.metrics.bean.CshAdviceBean;
import com.metrics.bean.DepBean;
import com.metrics.bean.ErinstBean;
import com.metrics.bean.ModRepoBean;
import com.metrics.bean.MortgageRegexBean;
import com.metrics.bean.MortgageRelexBean;
import com.metrics.bean.OpenRepoBean;
import com.metrics.bean.ReiInstBean;
import com.metrics.bean.RepBean;
import com.metrics.bean.RepReqBean;
import com.metrics.bean.SecBlkBean;
import com.metrics.bean.SecStlmBean;
import com.metrics.bean.UndwBean;
import com.metrics.config.TCBConfig;
import com.metrics.mq.MessageSender;
import com.metrics.service.message.OXMService;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.def.CLOSEREPO;
import com.metrics.xml.message.tdcc.def.CONSIGNTINST;
import com.metrics.xml.message.tdcc.def.CSHADVICE;
import com.metrics.xml.message.tdcc.def.DEP;
import com.metrics.xml.message.tdcc.def.ERINST;
import com.metrics.xml.message.tdcc.def.MODREPO;
import com.metrics.xml.message.tdcc.def.MORTGAGEREGEX;
import com.metrics.xml.message.tdcc.def.MORTGAGERELEX;
import com.metrics.xml.message.tdcc.def.OPENREPO;
import com.metrics.xml.message.tdcc.def.REIINST;
import com.metrics.xml.message.tdcc.def.REP;
import com.metrics.xml.message.tdcc.def.REPREQ;
import com.metrics.xml.message.tdcc.def.SECBLK;
import com.metrics.xml.message.tdcc.def.SECSTLM;
import com.metrics.xml.message.tdcc.def.UNDW;
import com.metrics.xml.message.tdcc.xml.CLOSEREPOMessage;
import com.metrics.xml.message.tdcc.xml.CONSIGNTINSTMessage;
import com.metrics.xml.message.tdcc.xml.CSHADVICEMessage;
import com.metrics.xml.message.tdcc.xml.DEPMessage;
import com.metrics.xml.message.tdcc.xml.ERINSTMessage;
import com.metrics.xml.message.tdcc.xml.MODREPOMessage;
import com.metrics.xml.message.tdcc.xml.MORTGAGEREGEXMessage;
import com.metrics.xml.message.tdcc.xml.MORTGAGERELEXMessage;
import com.metrics.xml.message.tdcc.xml.OPENREPOMessage;
import com.metrics.xml.message.tdcc.xml.REIINSTMessage;
import com.metrics.xml.message.tdcc.xml.REPMessage;
import com.metrics.xml.message.tdcc.xml.REPREQMessage;
import com.metrics.xml.message.tdcc.xml.SECBLKMessage;
import com.metrics.xml.message.tdcc.xml.SECSTLMMessage;
import com.metrics.xml.message.tdcc.xml.UNDWMessage;


@Component
public class TDCCService
{
	protected static final Logger logger = LoggerFactory.getLogger( TDCCService.class );
	private static final String FORMAT_BCSS_TIMESTAMP = "yyyy-MM-dd'T'HH:mm:ss";
	private static final String FORMAT_BCSS_BUSINESS_DATE = "yyyy-MM-dd";
	@Autowired
	private SequenceService sequenceService = null;
	@Autowired
	private OXMService oxmService = null;
	@Autowired
	private TCBConfig tcbConfig = null;
	@Autowired
//	@Qualifier("IBMMessageSender")
	@Qualifier("JMSMessageSender")
	private MessageSender messageSender = null;

	public void sendCloseRepoRequest(CloseRepoBean instance) throws Throwable {
		try {
			CLOSEREPOMessage message = new CLOSEREPOMessage( instance );

			CLOSEREPO closeRepo = new CLOSEREPO( instance.getBody() );

			message.setBody( closeRepo );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendConsigntInstRequest(ConsigntInstBean instance) throws Throwable {
		try {
			CONSIGNTINSTMessage message = new CONSIGNTINSTMessage( instance );

			message.setBody( new CONSIGNTINST( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendCshAdviceRequest(CshAdviceBean instance) throws Throwable {
		try {
			CSHADVICEMessage message = new CSHADVICEMessage( instance );

			message.setBody( new CSHADVICE( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendDepRequest(DepBean instance) throws Throwable {
		try {
			DEPMessage message = new DEPMessage( instance );

			message.setBody( new DEP( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendErinstRequest(ErinstBean instance) throws Throwable {
		try {
			ERINSTMessage message = new ERINSTMessage( instance );

			message.setBody( new ERINST( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );;
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendModRepoRequest(ModRepoBean instance) throws Throwable {
		try {
			MODREPOMessage message = new MODREPOMessage( instance );

			message.setBody( new MODREPO( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendMortgageRegexRequest(MortgageRegexBean instance) throws Throwable {
		try {
			MORTGAGEREGEXMessage message = new MORTGAGEREGEXMessage( instance );

			message.setBody( new MORTGAGEREGEX( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendMortgageRelexRequest(MortgageRelexBean instance) throws Throwable {
		try {
			MORTGAGERELEXMessage message = new MORTGAGERELEXMessage( instance );

			message.setBody( new MORTGAGERELEX( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendOpenRepoRequest(OpenRepoBean instance) throws Throwable {
		try {
			OPENREPOMessage message = new OPENREPOMessage( instance );

			message.setBody( new OPENREPO( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendReiInstRequest(ReiInstBean instance) throws Throwable {
		try {
			REIINSTMessage message = new REIINSTMessage( instance );

			message.setBody( new REIINST( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendRepRequest(RepBean instance) throws Throwable {
		try {
			REPMessage message = new REPMessage( instance );

			message.setBody( new REP( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendRepReqRequest(RepReqBean instance) throws Throwable {
		try {
			REPREQMessage message = new REPREQMessage( instance );

			message.setBody( new REPREQ( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendSecBlkRequest(SecBlkBean instance) throws Throwable {
		try {
			SECBLKMessage message = new SECBLKMessage( instance );

			message.setBody( new SECBLK( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendSecStlmRequest(SecStlmBean instance) throws Throwable {
		try {
			SECSTLMMessage message = new SECSTLMMessage( instance );

			message.setBody( new SECSTLM( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendUndwRequest(UndwBean instance) throws Throwable {
		try {
			UNDWMessage message = new UNDWMessage( instance );

			message.setBody( new UNDW( instance.getBody() ) );

			messageSender.send( oxmService.marshallBCSSMessage( setBCSSMessage( message ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}
	
	private BCSSMESSAGE setBCSSMessage(BCSSMESSAGE instance) {
		Calendar calendar = Calendar.getInstance();
		instance.setTS( DateFormatUtils.format( calendar, FORMAT_BCSS_TIMESTAMP ) );
		instance.setBCSSBUSDT( DateFormatUtils.format( calendar, FORMAT_BCSS_BUSINESS_DATE ) );
		instance.setORIGIN( tcbConfig.getParticipantId() );
		instance.setSNDRREF( sequenceService.getSequence() );
		
		return instance;
	}
	
}
