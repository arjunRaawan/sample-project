package com.arjun.boot.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Bean
	public Job job() {
		return (Job) jobBuilderFactory.get("batchJOb");
	}

	@Bean
	public Step step2() {
		return null;

	}
}
