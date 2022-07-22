package com.bowis.home.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bowis.home.model.MemberDTO;
import com.bowis.home.service.MemberService;

@Controller
@PropertySources(value = { @PropertySource("classpath:application-local.properties"),
		@PropertySource("classpath:application-server.properties") })
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	@GetMapping(value = {"/","login"})
	public String home() {
		return "login";
	}
	
	@GetMapping("/signin")
	public String signin(Model model) {
		int num = 1 + (int) (Math.random() * 6);
		model.addAttribute("profile", "/image/profile_" + num + ".png");
		return "signin";
	}
	
	@PostMapping("/signin")
	public String signinPost(MemberDTO login) {
		ms.signin(login);
		return "/login";
	}
}
