package com.metrics.service;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.config.TCBConfig;
import com.metrics.dao.HistoryResponseDao;
import com.metrics.entity.HistoryResponse;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Service
public class HistoryResponseService
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryResponseService.class );
	private static final String FORMAT_FOLDER_DATE = "yyyyMMdd";
	@Autowired
	private TCBConfig tcbConfig = null;
	@Autowired
	private HistoryResponseDao historyResponseDao = null;

	public void save(String reqSndrRef, BCSSMESSAGE message) {
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
			entity.setReqSndrRef( reqSndrRef );
		
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
	
	public void writeLog(BCSSMESSAGE message, String reqSndrRef, String content) {
		try {
			File folder = new File( tcbConfig.getResponseSaveXmlPath(), DateFormatUtils.format( Calendar.getInstance(), FORMAT_FOLDER_DATE ) );

			if (!folder.exists()) {
				folder.mkdirs();
			}

			FileUtils.write( new File( folder, reqSndrRef + "-" + message.getSNDRREF() + ".xml" ), (CharSequence) content );
			save( reqSndrRef, message );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
