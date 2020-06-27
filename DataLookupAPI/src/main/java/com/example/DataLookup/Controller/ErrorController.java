package com.example.DataLookup.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ErrorController {

	@GetMapping
	public String getCustomError(Model model) {
		
		model.addAttribute("error", "error");
		return "error";
	}
	
}
