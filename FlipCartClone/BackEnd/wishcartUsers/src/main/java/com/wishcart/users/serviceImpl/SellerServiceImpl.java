package com.wishcart.users.serviceImpl;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;

import com.wishcart.users.model.Seller;

public interface SellerServiceImpl {

	ResponseEntity<HashMap<String, Object>> registerSeller(Seller seller);

}
