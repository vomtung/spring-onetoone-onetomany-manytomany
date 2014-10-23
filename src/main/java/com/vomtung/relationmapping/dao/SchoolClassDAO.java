package com.vomtung.relationmapping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vomtung.relationmapping.entity.SchoolClass;


@Repository("SchoolClassDAO")
@Transactional
public class SchoolClassDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void create(SchoolClass schoolClass) {
		entityManager.persist(schoolClass);
	}
	
	public List<SchoolClass> findAll() {
		Query query = entityManager.createQuery("select sc from SchoolClass sc",SchoolClass.class);
		return query.getResultList();
	}
	
	public SchoolClass findById(Long id) {
		return entityManager.find(SchoolClass.class, id);
	}
}
