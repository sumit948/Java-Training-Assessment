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
public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10000L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@Column
	private String productDescription;
	
	private String productDepartment;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductDepartment() {
		return productDepartment;
	}

	public void setProductDepartment(String productDepartment) {
		this.productDepartment = productDepartment;
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
		return Objects.hash(productDepartment, productDescription, productId, sf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(productDepartment, other.productDepartment)
				&& Objects.equals(productDescription, other.productDescription)
				&& Objects.equals(productId, other.productId) && Objects.equals(sf, other.sf);
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productDescription=" + productDescription
				+ ", productDepartment=" + productDepartment + ", sf=" + sf + "]";
	}
	
	


}
