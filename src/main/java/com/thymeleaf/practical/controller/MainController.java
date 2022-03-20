package com.thymeleaf.practical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/about", method= RequestMethod.GET)
	public String about(Model model) {	
		System.out.println("In about");
		model.addAttribute("name", "Naman Jain");
		return "about";
		//about.html will be returned and not about.jsp
	}
	
	@GetMapping(value="/service")
	public String getService(Model model) {
		System.out.println("Providing Service");
		return "servicePage";
	}
	
	@GetMapping("/newAbout")
	public String newAbout(Model model) {
		System.out.println("On newAboutPage");
		return "newAbout";
	}
}
