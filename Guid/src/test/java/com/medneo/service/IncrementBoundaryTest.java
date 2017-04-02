package com.medneo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.medneo.model.Guid;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncrementBoundaryTest {
	@Autowired
	Guid guid;
	
	@Autowired
	GuidService guidService;
	
	@Test
	public void testFirstBoundary() {
		guid.setGuidParts(arr);
		guidService.increment();
		
		Assert.assertEquals(0, guid.getGuidParts()[0]);
		Assert.assertEquals(1, guid.getGuidParts()[1]);
		Assert.assertEquals(0, guid.getGuidParts()[2]);
	}
	
	@Test
	public void testSecondBoundary() {
		guid.setGuidParts(arr1);
		guidService.increment();
		
		Assert.assertEquals(0, guid.getGuidParts()[0]);
		Assert.assertEquals(0, guid.getGuidParts()[1]);
		Assert.assertEquals(1, guid.getGuidParts()[2]);
	}
	
	int[] arr1 = {Integer.MAX_VALUE, Integer.MAX_VALUE, 0};
	int[] arr = {Integer.MAX_VALUE, 0, 0};

}
