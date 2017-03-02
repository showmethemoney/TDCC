package com.metrics.service.message;

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
import com.metrics.mq.ibm.TDCCMessageSender;
import com.metrics.service.HistoryRequestService;
import com.metrics.service.SequenceService;
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
	private TCBConfig tcbConfig = null;
	@Autowired
	private HistoryRequestService historyRequestService = null;
	@Autowired
	private SequenceService sequenceService = null;
	@Autowired
	private OXMService oxmService = null;
	@Autowired
	@Qualifier("TDCCMessageSender")
	private TDCCMessageSender messageSender = null;

	public void sendCloseRepoRequest(CloseRepoBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new CLOSEREPOMessage( instance );

			CLOSEREPO closeRepo = new CLOSEREPO( instance.getBody() );

			((CLOSEREPOMessage) message).setBody( closeRepo );

			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendConsigntInstRequest(ConsigntInstBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new CONSIGNTINSTMessage( instance );

			((CONSIGNTINSTMessage) message).setBody( new CONSIGNTINST( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendCshAdviceRequest(CshAdviceBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new CSHADVICEMessage( instance );

			((CSHADVICEMessage) message).setBody( new CSHADVICE( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendDepRequest(DepBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new DEPMessage( instance );

			((DEPMessage) message).setBody( new DEP( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendErinstRequest(ErinstBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new ERINSTMessage( instance );

			((ERINSTMessage) message).setBody( new ERINST( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendModRepoRequest(ModRepoBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new MODREPOMessage( instance );

			((MODREPOMessage) message).setBody( new MODREPO( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendMortgageRegexRequest(MortgageRegexBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new MORTGAGEREGEXMessage( instance );

			((MORTGAGEREGEXMessage) message).setBody( new MORTGAGEREGEX( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendMortgageRelexRequest(MortgageRelexBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new MORTGAGERELEXMessage( instance );

			((MORTGAGERELEXMessage) message).setBody( new MORTGAGERELEX( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendOpenRepoRequest(OpenRepoBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new OPENREPOMessage( instance );

			((OPENREPOMessage) message).setBody( new OPENREPO( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendReiInstRequest(ReiInstBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new REIINSTMessage( instance );

			((REIINSTMessage) message).setBody( new REIINST( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendRepRequest(RepBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new REPMessage( instance );

			((REPMessage) message).setBody( new REP( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendRepReqRequest(RepReqBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new REPREQMessage( instance );

			((REPREQMessage) message).setBody( new REPREQ( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendSecBlkRequest(SecBlkBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new SECBLKMessage( instance );

			((SECBLKMessage) message).setBody( new SECBLK( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendSecStlmRequest(SecStlmBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new SECSTLMMessage( instance );

			((SECSTLMMessage) message).setBody( new SECSTLM( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
			throw cause;
		}
	}

	public void sendUndwRequest(UndwBean instance) throws Throwable {
		BCSSMESSAGE message = null;
		String content = null;

		try {
			message = new UNDWMessage( instance );

			((UNDWMessage) message).setBody( new UNDW( instance.getBody() ) );
			message = setBCSSMessage( message );
			content = oxmService.marshallBCSSMessage( message );

			messageSender.send( content );

			historyRequestService.writeLog( message, content );
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
