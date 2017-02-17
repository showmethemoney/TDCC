package com.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.metrics.config.RAConfig;
import com.metrics.config.TCBConfig;


@Configuration
@ComponentScan(basePackages = "com.metrics")
@Import(
 { DatabaseConfig.class, MessageQueueConfig.class, OXMConfig.class, MockMessageQueueConfig.class }
//{ DatabaseConfig.class, TDCCMessageQueueConfig.class, OPCMessageQueueConfig.class, OXMConfig.class }
 )
@PropertySources({ @PropertySource("classpath:RA.properties"), @PropertySource("classpath:tcb.properties") })
public class AppConfig
{
	@Autowired
	private Environment env = null;
	
	@Bean
	public RAConfig raConfig() {
		RAConfig config = new RAConfig(
			env.getProperty( "OPC.CD.KEY" ), env.getProperty( "OPC.WORKING.KEY" ), env.getProperty( "OPC.WORKING.KEY.NEW" ), 
			env.getProperty( "OPC.RA.SERVERAP" ), env.getProperty( "OPC.RA.LOGINID" ), env.getProperty( "OPC.RA.PASSWORD" )
		);
		
		return config;
	}
	
	@Bean
	public TCBConfig tcbConfig() {
		TCBConfig config = new TCBConfig( env.getProperty( "participantId" ) );
		
		return config;
	}
}
