package com.assessment3.pract1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Employee emp = (Employee)appContext.getBean("emp1");
		Laptop lap = (Laptop)appContext.getBean("lap1");
		System.out.println(emp);
		System.out.println(lap);
	}

}
