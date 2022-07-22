package com.bowis.home.componet;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources(value = { @PropertySource("classpath:application-local.properties"),
		@PropertySource("classpath:application-server.properties") })
public class HashHandler {
	public String encrypt(String pwd) {
		return BCrypt.hashpw(pwd, BCrypt.gensalt());
	}
	
	public boolean decrypt(String plain,String crypted) {
		return BCrypt.checkpw(plain, crypted);
	}
}
