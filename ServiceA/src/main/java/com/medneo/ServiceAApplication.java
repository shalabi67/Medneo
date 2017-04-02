package com.medneo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceAApplication {
	@Value("${guid.server}")
	private String guidServer;
	
	public String getGuidServer() {
		return guidServer;
	}
	
	@Value("${serviceb.server}")
	private String serviceB;
	
	public String getServiceBServer() {
		return serviceB;
	}
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
}
