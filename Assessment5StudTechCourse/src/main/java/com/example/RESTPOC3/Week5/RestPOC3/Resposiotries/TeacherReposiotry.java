package com.example.RESTPOC3.Week5.RestPOC3.Resposiotries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Teacher;

@Repository
public interface TeacherReposiotry extends JpaRepository<Teacher, Long> {

}
