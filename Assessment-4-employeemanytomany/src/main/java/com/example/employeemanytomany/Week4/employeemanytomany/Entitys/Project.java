package com.example.employeemanytomany.Week3.employeemanytomany.Entitys;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;
    private String projectTitle;
    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees=new HashSet<Employee>();
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employees, projectId, projectTitle);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(employees, other.employees) && Objects.equals(projectId, other.projectId)
				&& Objects.equals(projectTitle, other.projectTitle);
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", employees=" + employees + "]";
	}
    
    
	
}
