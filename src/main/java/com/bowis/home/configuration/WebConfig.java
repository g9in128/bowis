package com.bowis.home.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@PropertySources(value = { @PropertySource("classpath:application-local.properties"),
		@PropertySource("classpath:application-server.properties") })
public class WebConfig implements WebMvcConfigurer{
	
	@Value("${upload.resources}")
	private String resources;
	
	@Value("${upload.path}")
	private String path;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(path)
				.addResourceLocations(resources);
	}
	
	public String getUploadedResources() {
		return resources;
	}
	
	public String getUploadedPath() {
		return path;
	}
	
}
