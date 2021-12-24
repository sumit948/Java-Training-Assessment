package com.example.employeeonetomany.Week3.employeeonetomany.entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.employeeonetomany.Week3.employeeonetomany.phoneenum.PhoneEnum;

@Entity
public class EmployeePhoneNos implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String comment;
    
    @Enumerated(EnumType.STRING)
    private PhoneEnum phone_TYPE;

    @ManyToOne
    @JoinColumn(name="employee_id", nullable=false)
    private Employee employee;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public PhoneEnum getPhone_TYPE() {
		return phone_TYPE;
	}

	public void setPhone_TYPE(PhoneEnum phone_TYPE) {
		this.phone_TYPE = phone_TYPE;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, employee, phone_TYPE, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePhoneNos other = (EmployeePhoneNos) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(employee, other.employee)
				&& phone_TYPE == other.phone_TYPE && Objects.equals(pid, other.pid);
	}

	@Override
	public String toString() {
		return "EmployeePhoneNos [pid=" + pid + ", comment=" + comment + ", phone_TYPE=" + phone_TYPE + ", employee="
				+ employee + "]";
	}
    
    
}	
