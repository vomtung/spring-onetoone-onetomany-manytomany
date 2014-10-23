package com.vomtung.relationmapping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vomtung.relationmapping.dao.SchoolClassDAO;
import com.vomtung.relationmapping.entity.SchoolClass;
import com.vomtung.relationmapping.service.SchoolClassService;

@Component
public class SchoolClassServiceImpl implements SchoolClassService {

	@Autowired
	SchoolClassDAO schoolClassDAO;
	
	@Transactional
	public void addClass(SchoolClass schoolClass){
		//do some thing
		schoolClassDAO.create(schoolClass);
	};
	
	public List<SchoolClass> findAll(){
		return schoolClassDAO.findAll();
	};
	
	
	public SchoolClass findById(Long id){
		return schoolClassDAO.findById(id);
	};
}
