package com.metrics;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@Configuration
@ComponentScan(basePackages = "com.metrics")
@Import(
// { DatabaseConfig.class, MessageQueueConfig.class, OXMConfig.class, MockMessageQueueConfig.class }
{ DatabaseConfig.class, IBMMessageQueueConfig.class, OXMConfig.class })
@PropertySources({ @PropertySource("classpath:RA.properties") })
public class AppConfig
{
}
