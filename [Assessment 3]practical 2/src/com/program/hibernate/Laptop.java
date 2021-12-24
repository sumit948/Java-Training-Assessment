package com.program.hibernate;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer laptopId;
	private String modelNo;
	public Integer getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(laptopId, modelNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(laptopId, other.laptopId) && Objects.equals(modelNo, other.modelNo);
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelNo=" + modelNo + "]";
	}
	
}
