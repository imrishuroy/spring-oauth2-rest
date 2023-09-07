package com.rishu.springoauth2.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://medium.com/geekculture/springboot-api-authentication-using-oauth2-with-google-655b8759f0ac

@SpringBootApplication
public class ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApplication.class, args);
	}

}
