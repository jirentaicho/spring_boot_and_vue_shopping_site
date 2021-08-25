package com.volkruss.wannaishop.domain.settings.auth;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class MisakaWebMvcConfig implements WebMvcConfigurer{
	  @Override
	  public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**")
	            .allowedOrigins("http://localhost:8888","192.168.11.13:8888")
	            .allowedMethods("GET", "POST", "PUT", "DELETE")
	            .allowedHeaders("Authorization");
	  }
}
