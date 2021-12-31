package com.example.employeeonelaptop.employeeonelaptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeonelaptop.employeeonelaptop.entitys.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, String> {

}
