package com.vomtung.relationmapping.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="school_class")
public class SchoolClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="class_id")
	Long id;
	
	@Column(name="class_name")
	String className;
	
	@Column(name="room")
	String room;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER, mappedBy = "classes")
	Set<Student> students;

	public SchoolClass() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
