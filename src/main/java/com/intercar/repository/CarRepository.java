package com.intercar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercar.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	

}
