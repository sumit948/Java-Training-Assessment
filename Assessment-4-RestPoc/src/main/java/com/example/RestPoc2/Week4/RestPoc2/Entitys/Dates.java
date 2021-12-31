package com.example.RestPoc2.Week4.RestPoc2.Entitys;

import java.io.Serializable;
import java.util.Date;
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
public class Dates implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dateId;
	
	@Column
	private Long year;
	
	private Long month;
	
	private Long day;

	private Date fullDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SalesFact> sf;

	public Long getDateId() {
		return dateId;
	}

	public void setDateId(Long dateId) {
		this.dateId = dateId;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public Long getMonth() {
		return month;
	}

	public void setMonth(Long month) {
		this.month = month;
	}

	public Long getDay() {
		return day;
	}

	public void setDay(Long day) {
		this.day = day;
	}

	public Date getFullDate() {
		return fullDate;
	}

	public void setFullDate(Date fullDate) {
		this.fullDate = fullDate;
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
		return Objects.hash(dateId, day, fullDate, month, sf, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dates other = (Dates) obj;
		return Objects.equals(dateId, other.dateId) && Objects.equals(day, other.day)
				&& Objects.equals(fullDate, other.fullDate) && Objects.equals(month, other.month)
				&& Objects.equals(sf, other.sf) && Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "Dates [dateId=" + dateId + ", year=" + year + ", month=" + month + ", day=" + day + ", fullDate="
				+ fullDate + ", sf=" + sf + "]";
	}
	
	
	
}
