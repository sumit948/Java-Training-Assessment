package com.example.RESTPOC3.Week5.RestPOC3.Entitys;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CourseId;
	
	@Column
	private String courseName;
	
	private String courseDuration;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Students> stud;

	public Long getCourseId() {
		return CourseId;
	}

	public void setCourseId(Long courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Set<Students> getStud() {
		return stud;
	}

	public void setStud(Set<Students> stud) {
		this.stud = stud;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CourseId, courseDuration, courseName, stud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		return Objects.equals(CourseId, other.CourseId) && Objects.equals(courseDuration, other.courseDuration)
				&& Objects.equals(courseName, other.courseName) && Objects.equals(stud, other.stud);
	}

	@Override
	public String toString() {
		return "Courses [CourseId=" + CourseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", stud=" + stud + "]";
	}
	
	

}
