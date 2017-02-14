package com.metrics.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.config.RAConfig;
import com.metrics.utils.OpcUtil;
import com.metrics.xml.message.opc.xml.CHGKEYREQMessage;


@Service
public class OPCKeyService
{
	protected static final Logger logger = LoggerFactory.getLogger( OPCKeyService.class );
	@Autowired
	private RAConfig raConfig = null;

	protected void changeKeyRequest() {
		try {
			CHGKEYREQMessage message = new CHGKEYREQMessage();

			message.setAUDITNO( OpcUtil.newAuditNo() );
			message.setORIGIN( "" );
			
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	protected void changeKey() {

	}

}
