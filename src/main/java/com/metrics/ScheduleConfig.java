package com.metrics;

import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;


@Configuration
@EnableScheduling
@PropertySources({ @PropertySource("classpath:scheduler.properties") })
public class ScheduleConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( ScheduleConfig.class );

	@Bean
	public TaskScheduler taskExecutor() {
		return new ConcurrentTaskScheduler( Executors.newScheduledThreadPool( 3 ) );
	}
}
