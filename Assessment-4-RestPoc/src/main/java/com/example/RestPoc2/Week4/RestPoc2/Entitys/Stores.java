package com.example.RestPoc2.Week4.RestPoc2.Entitys;

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
public class Stores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storesId;
	
	@Column
	private String storeDescription;
	
	private String storeAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	public Long getStoresId() {
		return storesId;
	}

	public void setStoresId(Long storesId) {
		this.storesId = storesId;
	}

	public String getStoreDescription() {
		return storeDescription;
	}

	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public Set<SalesFact> getSf() {
		return sf;
	}

	public void setSf(Set<SalesFact> sf) {
		this.sf = sf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sf, storeAddress, storeDescription, storesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		return Objects.equals(sf, other.sf) && Objects.equals(storeAddress, other.storeAddress)
				&& Objects.equals(storeDescription, other.storeDescription) && Objects.equals(storesId, other.storesId);
	}

	@Override
	public String toString() {
		return "Stores [storesId=" + storesId + ", storeDescription=" + storeDescription + ", storeAddress="
				+ storeAddress + ", sf=" + sf + "]";
	}
	
	

}
