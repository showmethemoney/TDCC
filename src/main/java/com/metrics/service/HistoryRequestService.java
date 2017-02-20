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
import com.metrics.dao.HistoryRequestDao;
import com.metrics.entity.HistoryRequest;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;


@Service
public class HistoryRequestService
{
	protected static final Logger logger = LoggerFactory.getLogger( HistoryRequestService.class );
	private static final String FORMAT_FOLDER_DATE = "yyyyMMdd";
	@Autowired
	private TCBConfig tcbConfig = null;
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

	public void writeLog(BCSSMESSAGE message, String content) {
		try {
			File folder = new File( tcbConfig.getRequestSaveXmlPath(), DateFormatUtils.format( Calendar.getInstance(), FORMAT_FOLDER_DATE ) );

			if (!folder.exists()) {
				folder.mkdirs();
			}

			FileUtils.write( new File( folder, message.getSNDRREF() + ".xml" ), (CharSequence) message );
			save( message );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
