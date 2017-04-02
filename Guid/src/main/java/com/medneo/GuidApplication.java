package com.medneo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuidApplication {
	private static final int MAX_SYSTEM_ID = 1295;
	@Value("${guid.systemid}")
	private int systemId;
	
	public int getSystemId() {
		if(systemId > MAX_SYSTEM_ID) {
			throw new IllegalArgumentException("System id is out of range.");
		}
		return systemId;
	}
	public static void main(String[] args) {
		SpringApplication.run(GuidApplication.class, args);
	}
}
