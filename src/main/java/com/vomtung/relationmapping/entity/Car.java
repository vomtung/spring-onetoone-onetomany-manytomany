package com.vomtung.relationmapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="car_id")
	Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
