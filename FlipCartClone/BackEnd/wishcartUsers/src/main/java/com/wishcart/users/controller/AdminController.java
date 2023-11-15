package com.wishcart.users.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wishcart.users.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/authLogin")
	public ResponseEntity<HashMap<String,Object>> registerSeller(HttpServletRequest request,@RequestParam String userName,@RequestParam String password){
		return adminService.authLogin(userName,password);
	}
}
