package com.example.RestPoc2.Week4.RestPoc2.Entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalesFact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100000L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long salesId;
	
	@Column
	private Double amount;
	
	private Double Quantity;
	
	private Double Cost;

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getQuantity() {
		return Quantity;
	}

	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}

	public Double getCost() {
		return Cost;
	}

	public void setCost(Double cost) {
		Cost = cost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cost, Quantity, amount, salesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesFact other = (SalesFact) obj;
		return Objects.equals(Cost, other.Cost) && Objects.equals(Quantity, other.Quantity)
				&& Objects.equals(amount, other.amount) && Objects.equals(salesId, other.salesId);
	}

	@Override
	public String toString() {
		return "SalesFact [salesId=" + salesId + ", amount=" + amount + ", Quantity=" + Quantity + ", Cost=" + Cost
				+ "]";
	}
	
	
	
}
