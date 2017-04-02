package com.medneo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medneo.GuidApplication;

@Component
public class Guid {
	private static final int radix = 36;
	@Autowired
	GuidApplication guidApplication;
	
	int[] guidParts = {0, 0, 0};

	public int[] getGuidParts() {
		return guidParts;
	}
	public void setGuidParts(int[] guidParts) {
		this.guidParts = guidParts;
	}
	public void setGuidPart(int guidPartIndex, int value) {
		if(guidParts!=null && guidPartIndex<guidParts.length) {
			this.guidParts[guidPartIndex] = value;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public int getSystemId() {
		return guidApplication.getSystemId();
	}

	
	@Override
	public String toString() {
		StringBuffer guidBuffer = new StringBuffer();
		int systemId = getSystemId();
		guidBuffer.append(Integer.toString(systemId, radix));
		for(int i=guidParts.length -1;i>=0;i--) {
			guidBuffer.append(Integer.toString(guidParts[i], radix));
		}
		return guidBuffer.toString();
	}
	
	
	
	
}
