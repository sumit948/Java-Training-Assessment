package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentRollNo;
	private Long standaredId;
	
	@Column
	private String studentName;
	private String RowVersion;

	@ManyToMany(cascade=CascadeType.ALL)
	private Coureses course;

	public Long getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(Long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public Long getStandaredId() {
		return standaredId;
	}

	public void setStandaredId(Long standaredId) {
		this.standaredId = standaredId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRowVersion() {
		return RowVersion;
	}

	public void setRowVersion(String rowVersion) {
		RowVersion = rowVersion;
	}

	public Coureses getCourse() {
		return course;
	}

	public void setCourse(Coureses course) {
		this.course = course;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RowVersion, course, standaredId, studentName, studentRollNo);
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
		return Objects.equals(RowVersion, other.RowVersion) && Objects.equals(course, other.course)
				&& Objects.equals(standaredId, other.standaredId) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentRollNo, other.studentRollNo);
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", standaredId=" + standaredId + ", studentName="
				+ studentName + ", RowVersion=" + RowVersion + ", course=" + course + "]";
	}



	
	
}
