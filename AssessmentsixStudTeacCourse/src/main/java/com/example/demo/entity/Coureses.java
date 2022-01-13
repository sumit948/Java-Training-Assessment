package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Coureses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CcourseId;
	private Long TeacherId;
	
	@Column
	private String courseName;
	private String location;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Student student;

	public Long getCcourseId() {
		return CcourseId;
	}

	public void setCcourseId(Long ccourseId) {
		CcourseId = ccourseId;
	}

	public Long getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(Long teacherId) {
		TeacherId = teacherId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CcourseId, TeacherId, courseName, location, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coureses other = (Coureses) obj;
		return Objects.equals(CcourseId, other.CcourseId) && Objects.equals(TeacherId, other.TeacherId)
				&& Objects.equals(courseName, other.courseName) && Objects.equals(location, other.location)
				&& Objects.equals(student, other.student);
	}

	@Override
	public String toString() {
		return "Coureses [CcourseId=" + CcourseId + ", TeacherId=" + TeacherId + ", courseName=" + courseName
				+ ", location=" + location + ", student=" + student + "]";
	}
	
	
	
	
}
