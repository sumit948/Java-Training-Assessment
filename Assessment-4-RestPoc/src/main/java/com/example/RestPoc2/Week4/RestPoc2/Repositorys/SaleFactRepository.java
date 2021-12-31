package com.example.RestPoc2.Week4.RestPoc2.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.SalesFact;

@Repository
public interface SaleFactRepository extends JpaRepository<SalesFact, Long> {

}
