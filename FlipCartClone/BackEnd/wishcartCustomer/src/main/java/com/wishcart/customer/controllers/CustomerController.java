package com.wishcart.customer.controllers;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wishcart.customer.models.Customer;
import com.wishcart.customer.services.CustomerService;
import jakarta.servlet.http.HttpServletRequest;

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
