package com.cg.hibernateonetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {

	@Id
	@SequenceGenerator(name = "courseSeqGen", sequenceName = "courseSeq", initialValue = 200, allocationSize = 100)
	@GeneratedValue(generator = "courseSeqGen")
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	public Course() {
		super();
	}

	public Course(String title) {
		super();
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
}