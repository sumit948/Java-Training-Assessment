package com.example.employeeonelaptop.employeeonelaptop.entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Laptop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long laptopId;
    private String laptopModel;
    private String laptopBrand;
	public Long getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Long laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopModel() {
		return laptopModel;
	}
	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(laptopBrand, laptopId, laptopModel);
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
		return Objects.equals(laptopBrand, other.laptopBrand) && Objects.equals(laptopId, other.laptopId)
				&& Objects.equals(laptopModel, other.laptopModel);
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopModel=" + laptopModel + ", laptopBrand=" + laptopBrand + "]";
	}
	
}
