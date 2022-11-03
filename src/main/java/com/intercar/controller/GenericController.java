package com.intercar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenericController {

	@RequestMapping("/")
	public String raiz() {
		return "home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/minhasReservas")
	public String minhasReservas() {
		return "minhasReservas";
	}
	
	@GetMapping("/listCarsByFilter")
	public String listCarsByFilter() {
		return "listCarsByFilter";
	}
	
	@GetMapping("/carPreview")
	public String carPreview() {
		return "carPreview";
	}
	
	@GetMapping("/anuncie")
	public String anuncie() {
		return "anuncie";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
}
