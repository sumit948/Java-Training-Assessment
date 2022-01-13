package com.example.studteccourse.Assessmentsixstudentteachcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studteccourse.Assessmentsixstudentteachcourse.entitys.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
