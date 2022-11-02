package com.intercar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String raiz() {
		return "home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
}
