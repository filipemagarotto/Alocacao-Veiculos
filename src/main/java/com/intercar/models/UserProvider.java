package com.intercar.models;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userprovider")
public class UserProvider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String social_reason;
	private String state_registration;
	private String email;
	private String password_provider;
	private Calendar create_date;
	
	public UserProvider() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSocial_reason() {
		return social_reason;
	}

	public void setSocial_reason(String social_reason) {
		this.social_reason = social_reason;
	}

	public String getState_registration() {
		return state_registration;
	}

	public void setState_registration(String state_registration) {
		this.state_registration = state_registration;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword_provider() {
		return password_provider;
	}

	public void setPassword_provider(String password_provider) {
		this.password_provider = password_provider;
	}

	public Calendar getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Calendar create_date) {
		this.create_date = create_date;
	}
	
}
