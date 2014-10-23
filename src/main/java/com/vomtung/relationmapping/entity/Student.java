package com.vomtung.relationmapping.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.springframework.format.annotation.DateTimeFormat;

import com.vomtung.relationmapping.type.SexEnum;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	Long id;

	@Column(name="student_name")
	String studentName;
	
	@Column(name="sex")
	@Enumerated(value=EnumType.STRING)
	SexEnum sex;
	
	@Column(name="birthday")
	@DateTimeFormat(style = "M-")
	Date birthday;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(	name="students_classes", 
				joinColumns={@JoinColumn(name="student_id")},
				inverseJoinColumns={@JoinColumn(name="class_id")})
	Set<SchoolClass> classes;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Set<SchoolClass> getClasses() {
		return classes;
	}

	public void setClasses(Set<SchoolClass> classes) {
		this.classes = classes;
	}
	
}
