package com.intercar.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserProvider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private String cnpj;

	@Column
	private String social_reason;

	@Column
	private String state_registration;

	@Column
	private String email;

	@Column
	private String password_provider;

	@Column
	private Date create_date;

}
