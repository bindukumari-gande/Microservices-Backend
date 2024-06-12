package com.example.SocialProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication

public class SocialProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialProfileApplication.class, args);
	}

}
