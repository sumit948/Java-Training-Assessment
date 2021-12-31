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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	
	@Column
	private String customerName;
	
	private String customerAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Products> prod;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Set<SalesFact> getSf() {
		return sf;
	}

	public void setSf(Set<SalesFact> sf) {
		this.sf = sf;
	}

	public Set<Products> getProd() {
		return prod;
	}

	public void setProd(Set<Products> prod) {
		this.prod = prod;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerAddress, customerId, customerName, prod, sf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(customerAddress, other.customerAddress) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(prod, other.prod)
				&& Objects.equals(sf, other.sf);
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", sf=" + sf + ", prod=" + prod + "]";
	}
	
	
	

}
