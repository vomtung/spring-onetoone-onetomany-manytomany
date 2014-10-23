package com.vomtung.relationmapping.service;

import java.util.List;

import com.vomtung.relationmapping.entity.SchoolClass;

public interface SchoolClassService {

	public void addClass(SchoolClass schoolClass);
	
	public List<SchoolClass> findAll();
	
	public SchoolClass findById(Long id);
}
