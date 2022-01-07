package com.example.RESTPOC3.Week5.RestPOC3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.RESTPOC3.Week5.RestPOC3.Controller.StudentController;
import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Students;

@SpringBootTest
public class StudentTesting {
	@Autowired
	private StudentController stCon;
	
	@Test
	public void testdeleteCall() {
		Students s1 = new Students();
		assertEquals("Deleted Student", stCon.deleteCall(s1));
	}
	
}
