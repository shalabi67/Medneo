package com.medneo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuidApplication {
	@Value("${guid.scale}")
	private int guidScale;
	
	public int getGuidScale() {
		return guidScale;
	}
	public static void main(String[] args) {
		SpringApplication.run(GuidApplication.class, args);
	}
}
