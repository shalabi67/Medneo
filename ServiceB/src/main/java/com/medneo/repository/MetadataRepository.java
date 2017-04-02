package com.medneo.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MetadataRepository {
	private HashMap<String, Set<Object>> metadatMap = new HashMap<>();
	
	public void add(String guid, Object metadata) {
		if(metadatMap.containsKey(guid)) {
			Set<Object> set = metadatMap.get(guid);
			set.add(metadata);
		} else {
			Set<Object> set = new HashSet<>();
			set.add(metadata);
			metadatMap.put(guid,  set);
		}
	}

	public HashMap<String, Set<Object>> getMetadatMap() {
		return metadatMap;
	}
	
}
