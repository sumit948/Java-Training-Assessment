package com.assessment3.singaltoneandprototype;

import java.util.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class Student {
		private String stName;
		private String stAddress;
		public String getStName() {
			return stName;
		}
		public void setStName(String stName) {
			this.stName = stName;
		}
		public String getStAddress() {
			return stAddress;
		}
		public void setStAddress(String stAddress) {
			this.stAddress = stAddress;
		}
		@Override
		public int hashCode() {
			return Objects.hash(stAddress, stName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(stAddress, other.stAddress) && Objects.equals(stName, other.stName);
		}
		@Override
		public String toString() {
			return "Student [stName=" + stName + ", stAddress=" + stAddress + "]";
		}
		
		
}
