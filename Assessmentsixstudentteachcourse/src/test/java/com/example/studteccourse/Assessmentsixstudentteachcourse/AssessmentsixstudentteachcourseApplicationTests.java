package com.example.studteccourse.Assessmentsixstudentteachcourse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.studteccourse.Assessmentsixstudentteachcourse.controller.MyController;
import com.example.studteccourse.Assessmentsixstudentteachcourse.entitys.Student;

@SpringBootTest
class AssessmentsixstudentteachcourseApplicationTests {

	@Autowired
	private MyController myContro;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testdeleteCall() {
		Student st = new Student();
		assertEquals("Student Deleted", myContro.deleteStudnent(st));
	}
}
