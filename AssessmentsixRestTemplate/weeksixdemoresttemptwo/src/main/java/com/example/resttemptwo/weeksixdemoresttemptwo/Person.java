package com.example.resttemptwo.weeksixdemoresttemptwo;

import java.util.Objects;

public class Person {
	private String personName;
	
	private String personAdd;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAdd() {
		return personAdd;
	}

	public void setPersonAdd(String personAdd) {
		this.personAdd = personAdd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(personAdd, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(personAdd, other.personAdd) && Objects.equals(personName, other.personName);
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAdd=" + personAdd + "]";
	}
	
	
}
