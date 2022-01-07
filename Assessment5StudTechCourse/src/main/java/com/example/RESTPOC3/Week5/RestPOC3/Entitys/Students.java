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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.websocket.OnError;

@Entity
public class Students implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentRollNo;
	
	@Column
	private String studentName;

	@OneToOne(cascade = CascadeType.ALL)
	private StudentAddress stad;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Courses> course;

	public Long getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(Long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StudentAddress getStad() {
		return stad;
	}

	public void setStad(StudentAddress stad) {
		this.stad = stad;
	}

	public Set<Courses> getCourse() {
		return course;
	}

	public void setCourse(Set<Courses> course) {
		this.course = course;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, stad, studentName, studentRollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(course, other.course) && Objects.equals(stad, other.stad)
				&& Objects.equals(studentName, other.studentName) && Objects.equals(studentRollNo, other.studentRollNo);
	}

	@Override
	public String toString() {
		return "Students [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", stad=" + stad
				+ ", course=" + course + "]";
	}
	
	

		

}
