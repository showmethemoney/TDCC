package com.metrics.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.dao.HistoryResponseDao;
import com.metrics.entity.HistoryResponse;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Service
public class HistoryResponseService
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryResponseService.class );
	@Autowired
	private HistoryResponseDao historyResponseDao = null;

	public void save(BCSSMESSAGE message) {
		try {
			HistoryResponse entity = new HistoryResponse();
			
			entity.setAction( message.getACTION() );
			entity.setBcssBusDt( message.getBCSSBUSDT() );
			entity.setMsgType( message.getMSGTYPE() );
			entity.setNarr( message.getNARR() );
			entity.setOrigin( message.getORIGIN() );
			entity.setResend( message.getRESEND() );
			entity.setSndrRef( message.getSNDRREF() );
			entity.setTs( message.getTS() );
		
			historyResponseDao.save( entity );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
	
	public List<HistoryResponse> select() {
		return historyResponseDao.select();
	}
	
	public List<HistoryResponse> queryBySndrRef(String sndrRef) {
		return historyResponseDao.queryBySndrRef( sndrRef );
	}
}
