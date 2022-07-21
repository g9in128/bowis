package com.bowis.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping(value = {"/","login"})
	public String home() {
		return "login";
	}
	
	@GetMapping("/signin")
	public String signin(Model model) {
		int num = 1 + (int) (Math.random() * 6);
		model.addAttribute("profile", "/static/image/profile_" + num + ".png");
		return "signin";
	}
}
