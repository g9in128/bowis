package com.bowis.home.componet;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.bowis.home.configuration.WebConfig;
import com.bowis.home.model.MemberDTO;

@Component
@PropertySources(value = { @PropertySource("classpath:application-local.properties"),
		@PropertySource("classpath:application-server.properties") })
public class FileHandler {
	
	@Autowired
	private WebConfig config;
	
	public String upload(MemberDTO dto) {
		//get location info
		String resources = config.getUploadedResources();
		String path = config.getUploadedPath().replace("*", "");
		
		//mkdir
		File location = new File(resources);
		if (!location.exists()) {
			location.mkdirs();
		}
		
		//check input file
		MultipartFile file = dto.getImage();
		if (file == null || file.isEmpty()) {
			return dto.getDefault_profile();
		}
		
		//make uploadname
		String fname = file.getOriginalFilename();
		String extension = fname.substring(fname.lastIndexOf("."));
		String uploadName = dto.getMemberNum() + extension;
		System.out.println(uploadName);
		
		//transfer
		try {
			file.transferTo(new File(resources + uploadName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return dto.getDefault_profile();
		} catch (IOException e) {
			e.printStackTrace();
			return dto.getDefault_profile();
		}
		return path + uploadName; 
	}
}
