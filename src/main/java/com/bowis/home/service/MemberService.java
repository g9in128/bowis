package com.bowis.home.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

import com.bowis.home.componet.FileHandler;
import com.bowis.home.componet.HashHandler;
import com.bowis.home.model.MemberDTO;

@Service
@PropertySources(value = { @PropertySource("classpath:application-local.properties"),
		@PropertySource("classpath:application-server.properties") })
public class MemberService {
	
	@Value("#{new Long(${member.standard.time})}")
	private long standardTime; //2022-07-22 12:01:35
	
	@Autowired
	private HashHandler hh;
	
	@Autowired
	private FileHandler fh;

	public void signin(MemberDTO login) {
		login.setMemberNum(System.currentTimeMillis() - standardTime);
		login.setPassword(hh.encrypt(login.getPassword()));
		login.setProfileImage(fh.upload(login));
		System.out.println(login);
	}
	
}
