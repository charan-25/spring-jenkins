package com.jenkins.app;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSampleApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsSampleApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application executing is going on!!!");
		
	}
	
	public static void main(String[] args) {
		logger.info("Application execution started...");
		SpringApplication.run(JenkinsSampleApplication.class, args);
	}

}
