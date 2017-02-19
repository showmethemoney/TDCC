package com.metrics.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.dao.HistoryRequestDao;
import com.metrics.entity.HistoryRequest;
import com.metrics.entity.HistoryResponse;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Service
public class HistoryRequestService
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryRequestService.class );
	@Autowired
	private HistoryRequestDao historyRequestDao = null;

	public void save(BCSSMESSAGE message) {
		try {
			HistoryRequest entity = new HistoryRequest();

			entity.setAction( message.getACTION() );
			entity.setBcssBusDt( message.getBCSSBUSDT() );
			entity.setMsgType( message.getMSGTYPE() );
			entity.setNarr( message.getNARR() );
			entity.setOrigin( message.getORIGIN() );
			entity.setResend( message.getRESEND() );
			entity.setSndrRef( message.getSNDRREF() );
			entity.setTs( message.getTS() );

			historyRequestDao.save( entity );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

	public List<HistoryRequest> select() {
		return historyRequestDao.select();
	}
}
