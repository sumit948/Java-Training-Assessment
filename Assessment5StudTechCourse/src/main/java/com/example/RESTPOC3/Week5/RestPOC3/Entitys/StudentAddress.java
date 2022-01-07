package com.example.RESTPOC3.Week5.RestPOC3.Entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentAddress implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentAddId;
	
	@Column
	private String studentAddress;

	public Long getStudentAddId() {
		return studentAddId;
	}

	public void setStudentAddId(Long studentAddId) {
		this.studentAddId = studentAddId;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentAddId, studentAddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentAddress other = (StudentAddress) obj;
		return Objects.equals(studentAddId, other.studentAddId) && Objects.equals(studentAddress, other.studentAddress);
	}

	@Override
	public String toString() {
		return "StudentAddress [studentAddId=" + studentAddId + ", studentAddress=" + studentAddress + "]";
	}

	
	
}
