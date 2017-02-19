package com.metrics.service;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.dao.SequenceDao;

@Service
public class SequenceService
{
	protected static final Logger logger = LoggerFactory.getLogger( SequenceService.class );
	@Autowired
	private SequenceDao sequenceDao = null;
	
	/**
	 * for BCSSMessage SNDR_REF field
	 * format = yyyyMMddXXXXXX
	 * @return
	 */	
	public String getSequence() {
		return String.format( "%1$s%2$06d", DateFormatUtils.format( Calendar.getInstance(), "yyyyMMdd" ), sequenceDao.getSequence() );
	}
}
