package com.metrics.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.metrics.config.RAConfig;
import com.metrics.service.message.opc.OpcKeyChangeService;

//@Component
public class OpcChangeKeyJob
{
	protected static final Logger logger = LoggerFactory.getLogger( OpcChangeKeyJob.class );

	@Autowired
	private OpcKeyChangeService opcKeyChangeService = null;
	@Autowired
	private RAConfig raConfig = null;

	// run at 08:50 everyday
	@Scheduled(cron = "${cron.opc.change.key.job}")
	public void dailyChangeOPCKey() {
		try {
			int retryTime = Integer.parseInt( raConfig.getRetryTimes() );
			long retryDuration = Long.parseLong( raConfig.getRetryDuration() );

			// set RA server ip...
//			opcKeyChangeService.setRaFacade( new RAFacade2( raConfig.getServerIP() ) );

			for (int i = 1; i <= retryTime; i++) {
				logger.info( "start to change opc key {} times", i );
				
				// RAFacade2 autowired..
				if (opcKeyChangeService.start()) {
					break;
				} else {
					logger.warn( "{} times try to change key with OPC failure. will retry after {} ms", i, retryDuration );
					Thread.sleep( retryDuration );
				}
				
				logger.info( "end to change opc key {} times", i );
			}
			
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
