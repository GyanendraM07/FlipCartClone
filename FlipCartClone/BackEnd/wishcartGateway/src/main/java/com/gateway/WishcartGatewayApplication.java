package com.gateway;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WishcartGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishcartGatewayApplication.class, args);
	}

}
