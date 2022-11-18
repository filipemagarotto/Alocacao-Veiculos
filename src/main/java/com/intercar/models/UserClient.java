package com.intercar.models;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_client")

public class UserClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long cpf;
	private String image_perfil;
	private String fullname;
	private String email;
	private Calendar birth_date;
	private String cep;
	private String cnh;
	private String complement;
	private String address;
	private String uf;
	private String city;
	private String state;
	private String password_client;
	private Calendar create_date;
	
	public UserClient() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getImage_perfil() {
		return image_perfil;
	}

	public void setImage_perfil(String image_perfil) {
		this.image_perfil = image_perfil;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Calendar birth_date) {
		this.birth_date = birth_date;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword_client() {
		return password_client;
	}

	public void setPassword_client(String password_client) {
		this.password_client = password_client;
	}

	public Calendar getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Calendar create_date) {
		this.create_date = create_date;
	}
	
}
