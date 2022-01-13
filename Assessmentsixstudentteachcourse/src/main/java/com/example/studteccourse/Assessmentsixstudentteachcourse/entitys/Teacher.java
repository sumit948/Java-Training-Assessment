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
import javax.persistence.OneToMany;

@Entity
public class Teacher implements Serializable  {
	private static final long serialVersionUID = 100L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String techId;
	
	@Column
	private String techName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student> stud;

	public String getTechId() {
		return techId;
	}

	public void setTechId(String techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public Set<Student> getStud() {
		return stud;
	}

	public void setStud(Set<Student> stud) {
		this.stud = stud;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stud, techId, techName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(stud, other.stud) && Objects.equals(techId, other.techId)
				&& Objects.equals(techName, other.techName);
	}

	@Override
	public String toString() {
		return "Teacher [techId=" + techId + ", techName=" + techName + ", stud=" + stud + "]";
	}
	
	
}
