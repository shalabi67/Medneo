package com.medneo.service;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medneo.repository.MetadataRepository;

@Service
public class MetadataService {
	@Autowired
	MetadataRepository metadataRepository;

	public void add(String guid, Object data) {
		metadataRepository.add(guid, data);
	}
	
	public Map<String, Set<Object>> getMetaData() {
		return metadataRepository.getMetadatMap();
	}
}
