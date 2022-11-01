package com.intercar.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "USER_CLIENT")
@Data
public class UserClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private String cpf;
	
	@Column
	private String image_perfil;
	
	@Column
	private String fullname;
	
	@Column
	private String email;
	
	@Column
	private String birth_date;
	
	@Column
	private String cep;
	
	@Column
	private String complement;
	
	@Column
	private String adrdress;
	
	@Column
	private String uf;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String password_client;
	
	@Column
	private Date create_date;

}
