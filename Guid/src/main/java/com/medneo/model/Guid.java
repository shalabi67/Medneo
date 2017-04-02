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
	int guidScale;
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
	public int getGuidScale() {
		return guidApplication.getGuidScale();
	}
	public void setGuidScale(int guidScale) {
		this.guidScale = guidScale;
	}
	
	@Override
	public String toString() {
		StringBuffer guidBuffer = new StringBuffer();
		guidBuffer.append(Integer.toString(guidScale, radix));
		for(int i=guidParts.length -1;i>=0;i--) {
			guidBuffer.append(Integer.toString(guidParts[i], radix));
		}
		return guidBuffer.toString();
	}
	
	
	
	
}
