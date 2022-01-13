package com.example.serviceone.weeksixserviceone;

import java.util.Objects;

public class Employee {
		private String employeeName;
		
		private String employeeAdd;

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getEmployeeAdd() {
			return employeeAdd;
		}

		public void setEmployeeAdd(String employeeAdd) {
			this.employeeAdd = employeeAdd;
		}

		@Override
		public int hashCode() {
			return Objects.hash(employeeAdd, employeeName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(employeeAdd, other.employeeAdd) && Objects.equals(employeeName, other.employeeName);
		}

		@Override
		public String toString() {
			return "Employee [employeeName=" + employeeName + ", employeeAdd=" + employeeAdd + "]";
		}
		
		
}
