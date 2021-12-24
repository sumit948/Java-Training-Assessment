package com.assessment3.singaltoneandprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Sample.xml");
		Student st = (Student)applicationContext.getBean("stud1"); 
		
		System.out.println(st.hashCode()); //this is first hashcode
		
		Student st2 = (Student)applicationContext.getBean("stud2");
		System.out.println(st2.hashCode());//this is diff hashcode

	}

}
