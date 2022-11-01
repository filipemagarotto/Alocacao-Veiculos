package com.intercar.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CONTRACT")
@Entity
public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column
	private String traffic_ticket;
	
	@Column
	private BigDecimal amount;
	
	@Column
	private String situation;
	
	@Column
	private String return_date;
	
	@Column
	private String lease_date;
	
	@Column
	private BigDecimal km;
	
	@Column
	private Boolean valid;
	
	@Column
	private String daily_amount;
	
}