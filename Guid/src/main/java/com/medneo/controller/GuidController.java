package com.medneo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medneo.service.GuidService;

@RestController
public class GuidController {
	@Autowired
	GuidService guidService;

	@RequestMapping("/guid")
	public ResponseEntity<String> createGuid() {
		try {
			return new ResponseEntity<String>(guidService.increment(),  HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("", HttpStatus.NOT_FOUND);
		}
	}
	
}
