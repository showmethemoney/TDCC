package com.metrics.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.metrics.service.message.opc.OpcKeyChangeService;


//@Component
public class OpcChangeKeyJob
{
	protected static final Logger logger = LoggerFactory.getLogger( OpcChangeKeyJob.class );

	@Autowired
	private OpcKeyChangeService opcKeyChangeService = null;

	// run at 08:50 everyday
	@Scheduled(cron = "${cron.opc.change.key.job}")
	public void dailyChangeOPCKey() {
		try {
			// set RA ...
			opcKeyChangeService.setRaFacade( null );
			logger.info( "start to change opc key " );
			
			opcKeyChangeService.start();
			
			logger.info( "end to change opc key " );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
