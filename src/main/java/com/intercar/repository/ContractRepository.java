package com.intercar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercar.models.Contract;

public interface ContractRepository extends JpaRepository <Contract, Long> {

}
