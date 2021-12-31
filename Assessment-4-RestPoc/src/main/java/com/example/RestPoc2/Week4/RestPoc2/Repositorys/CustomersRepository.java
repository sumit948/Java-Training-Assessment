package com.example.RestPoc2.Week4.RestPoc2.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
