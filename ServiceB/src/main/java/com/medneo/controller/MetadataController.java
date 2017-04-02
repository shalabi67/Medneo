package com.medneo.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medneo.service.MetadataService;

@RestController
@RequestMapping("/metadata")
public class MetadataController {
	private int count = 0;
	@Autowired
	MetadataService metadataService;

	@GetMapping("")
	public ResponseEntity<Map<String, Set<Object>>> getData() {
		return new ResponseEntity<Map<String, Set<Object>>>(metadataService.getMetaData(), HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<Void> addMetaData(@RequestBody String guid) {
		metadataService.add(guid, count + " This is guid data " + guid);
		count++;
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
