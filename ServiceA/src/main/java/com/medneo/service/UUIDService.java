package com.medneo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.medneo.ServiceAApplication;

@Service
public class UUIDService {
	@Autowired
	ServiceAApplication serviceAApplication;
	
	private String getNewUUID() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(serviceAApplication.getGuidServer(), String.class);
		return responseEntity.getBody();
	}
	
	public void sendMetadata() {
		String guid = getNewUUID();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(serviceAApplication.getServiceBServer(), guid, String.class);		
	}

}
