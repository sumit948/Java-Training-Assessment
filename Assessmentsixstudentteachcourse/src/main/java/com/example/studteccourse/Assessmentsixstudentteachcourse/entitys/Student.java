package com.example.studteccourse.Assessmentsixstudentteachcourse.entitys;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String studId;
	
	@Column
	private String studName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Set<Course> course;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Set<Teacher> tech;

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Set<Teacher> getTech() {
		return tech;
	}

	public void setTech(Set<Teacher> tech) {
		this.tech = tech;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, studId, studName, tech);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(studId, other.studId)
				&& Objects.equals(studName, other.studName) && Objects.equals(tech, other.tech);
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", course=" + course + ", tech=" + tech + "]";
	}

	
	
	
}
