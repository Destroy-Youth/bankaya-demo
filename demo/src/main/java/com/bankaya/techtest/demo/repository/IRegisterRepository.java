package com.bankaya.techtest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankaya.techtest.demo.model.Register;

@Repository
public interface IRegisterRepository extends JpaRepository<Register, Integer> {

}
