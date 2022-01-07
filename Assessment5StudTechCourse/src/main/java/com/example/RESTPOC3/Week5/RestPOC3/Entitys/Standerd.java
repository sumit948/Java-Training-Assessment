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
import javax.persistence.OneToMany;

@Entity
public class Standerd implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long standardId;
	
	@Column
	private String standName;
	
	private String standDescription;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Students> st;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Teacher> teacher;

	public Long getStandardId() {
		return standardId;
	}

	public void setStandardId(Long standardId) {
		this.standardId = standardId;
	}

	public String getStandName() {
		return standName;
	}

	public void setStandName(String standName) {
		this.standName = standName;
	}

	public String getStandDescription() {
		return standDescription;
	}

	public void setStandDescription(String standDescription) {
		this.standDescription = standDescription;
	}

	public Set<Students> getSt() {
		return st;
	}

	public void setSt(Set<Students> st) {
		this.st = st;
	}

	public Set<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(st, standDescription, standName, standardId, teacher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Standerd other = (Standerd) obj;
		return Objects.equals(st, other.st) && Objects.equals(standDescription, other.standDescription)
				&& Objects.equals(standName, other.standName) && Objects.equals(standardId, other.standardId)
				&& Objects.equals(teacher, other.teacher);
	}

	@Override
	public String toString() {
		return "Standerd [standardId=" + standardId + ", standName=" + standName + ", standDescription="
				+ standDescription + ", st=" + st + ", teacher=" + teacher + "]";
	}
	
	

}
