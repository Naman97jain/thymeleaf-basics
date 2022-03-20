package com.thymeleaf.practical.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IterativeController {
	
	@GetMapping("/test-iteration")
	public String testIteration(Model model) {
		List<String> names = new ArrayList<String>();
				
		names.add("Naman");
		names.add("Ayush");
		names.add("Yuvraj");
		names.add("Sagar");
		model.addAttribute("names", names);
		return "iteration";
	}
	
	@GetMapping("/test-conditionalOp")
	public String testConditionalOperator(Model model) {
		String name = "Jain";
		Boolean active=true;
		model.addAttribute("active", active);
		model.addAttribute("name", name);
		return "conditionalOperator.html";
	}
}

