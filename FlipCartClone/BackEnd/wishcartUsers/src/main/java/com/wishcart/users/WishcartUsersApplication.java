package com.wishcart.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WishcartUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishcartUsersApplication.class, args);
	}

}
