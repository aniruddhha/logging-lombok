package com.ani.logging.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {

	//https://logback.qos.ch/manual/layouts.html#conversionWord
	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}

}
