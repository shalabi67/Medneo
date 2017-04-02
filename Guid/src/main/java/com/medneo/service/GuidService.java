package com.medneo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medneo.model.Guid;

@Service
public class GuidService {
	@Autowired
	Guid guid;
	
	public synchronized String increment() {		
		int[] guidParts = guid.getGuidParts();
		if(guidParts == null) {
			throw new IllegalArgumentException("Guid is null.");
		}
		
		incrementPart(0, guidParts);
		guid.setGuidParts(guidParts);
		
		return guid.toString();
	}
	
	private void incrementPart(int i, int[] guidParts) {		
		if(i == guidParts.length) {
			throw new IllegalArgumentException("Out of range");
		}
		
		if(guidParts[i] != Integer.MAX_VALUE) {
			guidParts[i] = guidParts[i] + 1;
			return;
		} else {
			guidParts[i] = 0;
			incrementPart(i+1, guidParts);
		}
	}
}
