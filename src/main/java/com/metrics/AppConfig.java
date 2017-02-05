package com.metrics;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.metrics")
@Import({ MessageQueueConfig.class, DatabaseConfig.class })
public class AppConfig
{

}
