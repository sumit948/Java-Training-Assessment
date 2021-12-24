package com.assessment3.pract1;

public class Laptop {
		private String laptopName;
		private String laptopId;
		public String getLaptopName() {
			return laptopName;
		}
		public void setLaptopName(String laptopName) {
			this.laptopName = laptopName;
		}
		public String getLaptopId() {
			return laptopId;
		}
		public void setLaptopId(String laptopId) {
			this.laptopId = laptopId;
		}
		@Override
		public String toString() {
			return "Laptop [laptopName=" + laptopName + ", laptopId=" + laptopId + "]";
		}
		
}
