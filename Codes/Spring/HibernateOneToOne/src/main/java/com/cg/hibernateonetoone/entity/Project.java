package com.cg.hibernateonetoone.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Project {

	@Id
	@SequenceGenerator(name = "ProjectSeqGen", sequenceName = "ProjectSeq", initialValue = 200, allocationSize = 100)
	@GeneratedValue(generator = "ProjectSeqGen")
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany(mappedBy = "projects", cascade = {CascadeType.ALL})
	private Set<Instructor> instructors = new HashSet<Instructor>();
	
	public Project() {
		super();
	}

	public Project(String title) {
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
	
	public Set<Instructor> getInstructors() {
		return instructors;
	}
	
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + "]";
	}
}