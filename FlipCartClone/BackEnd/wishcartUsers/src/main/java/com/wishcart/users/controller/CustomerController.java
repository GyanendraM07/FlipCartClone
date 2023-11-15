package com.wishcart.users.controller;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wishcart.users.model.Customer;
import com.wishcart.users.model.Seller;
import com.wishcart.users.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/register")
	public ResponseEntity<HashMap<String,Object>> registerCustomer(HttpServletRequest request,@RequestBody Customer customer){
		return customerService.registerCustomer(customer);
	}
	
	@GetMapping("/authLogin")
	public ResponseEntity<HashMap<String,Object>> sellerAuthlogin(HttpServletRequest request,@RequestParam String userName,@RequestParam String password){
		return customerService.customerAuthLogin(userName,password);
	}
}
