package com.medneo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medneo.service.UUIDService;

@RestController
@RequestMapping("/uuids")
public class UUIDController {

	@Autowired
	UUIDService uuidService;
	
	@PostMapping("")
	public ResponseEntity<Void> sendMetadata() {
		uuidService.sendMetadata();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
