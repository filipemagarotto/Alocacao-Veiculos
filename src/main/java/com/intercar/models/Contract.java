package com.intercar.models;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long id_userclient;
	private Long id_userprovider_company;
	private Long id_car;
	private Long id_userprovider_client;
	private Long traffic_ticket;
	private Long amount;
	private String situation;
	private Calendar return_date;
	private Calendar lease_date;
	private Float km;
	private Boolean valid;
	private Float daily_amount;
	
	@OneToOne
	@JoinColumn(name = "id_car")
	private Car car;
	
	@ManyToOne
	@JoinColumn(name = "id_userprovider_company")
	private UserProvider userProvider_company;
	
	@ManyToOne
	@JoinColumn(name = "id_userprovider_client")
	private UserProvider userProvider_client;
	
	@ManyToOne
	@JoinColumn(name = "id_userclient")
	private UserClient userClient;

	
	public Contract() {
		
		}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId_userclient() {
		return id_userclient;
	}


	public void setId_userclient(Long id_userclient) {
		this.id_userclient = id_userclient;
	}


	public Long getId_userprovider_company() {
		return id_userprovider_company;
	}


	public void setId_userprovider_company(Long id_userprovider_company) {
		this.id_userprovider_company = id_userprovider_company;
	}


	public Long getId_car() {
		return id_car;
	}


	public void setId_car(Long id_car) {
		this.id_car = id_car;
	}


	public Long getId_userprovider_client() {
		return id_userprovider_client;
	}


	public void setId_userprovider_client(Long id_userprovider_client) {
		this.id_userprovider_client = id_userprovider_client;
	}


	public Long getTraffic_ticket() {
		return traffic_ticket;
	}


	public void setTraffic_ticket(Long traffic_ticket) {
		this.traffic_ticket = traffic_ticket;
	}


	public Long getAmount() {
		return amount;
	}


	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public String getSituation() {
		return situation;
	}


	public void setSituation(String situation) {
		this.situation = situation;
	}


	public Calendar getReturn_date() {
		return return_date;
	}


	public void setReturn_date(Calendar return_date) {
		this.return_date = return_date;
	}


	public Calendar getLease_date() {
		return lease_date;
	}


	public void setLease_date(Calendar lease_date) {
		this.lease_date = lease_date;
	}


	public Float getKm() {
		return km;
	}


	public void setKm(Float km) {
		this.km = km;
	}


	public Boolean getValid() {
		return valid;
	}


	public void setValid(Boolean valid) {
		this.valid = valid;
	}


	public Float getDaily_amount() {
		return daily_amount;
	}


	public void setDaily_amount(Float daily_amount) {
		this.daily_amount = daily_amount;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public UserProvider getUserProvider_company() {
		return userProvider_company;
	}


	public void setUserProvider_company(UserProvider userProvider_company) {
		this.userProvider_company = userProvider_company;
	}


	public UserProvider getUserProvider_client() {
		return userProvider_client;
	}


	public void setUserProvider_client(UserProvider userProvider_client) {
		this.userProvider_client = userProvider_client;
	}


	public UserClient getUserClient() {
		return userClient;
	}


	public void setUserClient(UserClient userClient) {
		this.userClient = userClient;
	}
	
}