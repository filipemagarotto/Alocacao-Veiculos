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
@Table(name= "car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long id_userprovider_client;
	private Long id_userprovider_company;
	private Long id_userclient;
	private String city_​​pick_up_location;
	private String specific_pick_up_location;
	private String car_model;
	private String car_color;
	private Calendar withdrawn_date;
	private Calendar return_date;
	private Long year_car;
	private Long rental_value;
	private String license_plate;
	private String car_brand;
	private Float km;
	private String gear;
	private Boolean air_conditioning;
	private String motor;
	
	
	@ManyToOne
	@JoinColumn(name = "id_userprovider_company")
	private UserProvider userProvider_company;
	
	@ManyToOne
	@JoinColumn(name = "id_userprovider_client")
	private UserProvider userProvider_client;
	
	@OneToOne
	@JoinColumn(name = "id_userclient")
	private UserClient userClient;
	
	public Car() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_userprovider_client() {
		return id_userprovider_client;
	}

	public void setId_userprovider_client(Long id_userprovider_client) {
		this.id_userprovider_client = id_userprovider_client;
	}

	public Long getId_userprovider_company() {
		return id_userprovider_company;
	}

	public void setId_userprovider_company(Long id_userprovider_company) {
		this.id_userprovider_company = id_userprovider_company;
	}

	public Long getId_userclient() {
		return id_userclient;
	}

	public void setId_userclient(Long id_userclient) {
		this.id_userclient = id_userclient;
	}

	public String getCity_​​pick_up_location() {
		return city_​​pick_up_location;
	}

	public void setCity_​​pick_up_location(String city_​​pick_up_location) {
		this.city_​​pick_up_location = city_​​pick_up_location;
	}

	public String getSpecific_pick_up_location() {
		return specific_pick_up_location;
	}

	public void setSpecific_pick_up_location(String specific_pick_up_location) {
		this.specific_pick_up_location = specific_pick_up_location;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}

	public Calendar getWithdrawn_date() {
		return withdrawn_date;
	}

	public void setWithdrawn_date(Calendar withdrawn_date) {
		this.withdrawn_date = withdrawn_date;
	}

	public Calendar getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Calendar return_date) {
		this.return_date = return_date;
	}

	public Long getYear_car() {
		return year_car;
	}

	public void setYear_car(Long year_car) {
		this.year_car = year_car;
	}

	public Long getRental_value() {
		return rental_value;
	}

	public void setRental_value(Long rental_value) {
		this.rental_value = rental_value;
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public Float getKm() {
		return km;
	}

	public void setKm(Float km) {
		this.km = km;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public Boolean getAir_conditioning() {
		return air_conditioning;
	}

	public void setAir_conditioning(Boolean air_conditioning) {
		this.air_conditioning = air_conditioning;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
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