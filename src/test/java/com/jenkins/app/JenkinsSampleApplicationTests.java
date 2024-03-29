package com.jenkins.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JenkinsSampleApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(JenkinsSampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Executing JenkinsSampleApplicationTests Test cases");
		assertEquals(true,true);
		logger.info("Completed Executing the test cases");
	}

}
