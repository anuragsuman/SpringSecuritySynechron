package com.spring.security.jwt.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringSecurityJwtExampleApplication {

	public static void main(String[] args) {
    	SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
