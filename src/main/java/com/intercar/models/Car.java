package com.intercar.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "CAR")
@Data
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private Long id;
	
	@Column
	private String city_​​pick_up_location;
	
	@Column
	private String specific_pick_up_location;
	
	@Column
	private String car_model;
	
	@Column
	private String car_color;
	
	@Column
	private String withdrawn_date;
	
	@Column
	private String return_date;
	
	@Column
	private String year_car;
	
	@Column
	private BigDecimal rental_value;
	
	@Column
	private String license_plate;
	
	@Column
	private String car_brand;
	
	@Column
	private BigDecimal km;
	
	@Column
	private String gear;
	
	@Column
	private Boolean air_conditioning;
	
	@Column
	private String motor;
}
