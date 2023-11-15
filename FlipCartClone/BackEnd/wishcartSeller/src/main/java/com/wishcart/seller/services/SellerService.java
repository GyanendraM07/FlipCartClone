package com.wishcart.seller.services;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wishcart.seller.Dao.SellerDao;
import com.wishcart.seller.models.Seller;
import com.wishcart.seller.servicesImpl.SellerServiceImpl;
import com.wishcart.users.exceptions.CustomException;

@Service
public class SellerService implements SellerServiceImpl {

	@Autowired
	SellerDao sellerDao;

	HashMap<String, Object> response = new HashMap<>();

	@Override
	public ResponseEntity<HashMap<String, Object>> registerSeller(Seller seller) {
		response.clear();
		if (seller != null) {
			sellerDao.save(seller);
			response.put("status", HttpStatus.OK);
			response.put("msg", "Seller Register Succesfully !!!");
			return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
		} else
			throw new CustomException("Seller data is null or empty", HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<HashMap<String, Object>> sellerAuthLogin(String userName, String password) {
		response.clear();
		if (userName.isEmpty() || password.isEmpty())
			throw new CustomException("Username and/or password is Empty", HttpStatus.BAD_REQUEST);
		Optional<Seller> seller = sellerDao.findByUserNameAndPassword(userName, password);
		if (seller.isPresent()) {
			response.put("status", HttpStatus.OK.value());
			response.put("message", "Login Succesfull");
			response.put("data", seller.get());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else
			throw new CustomException("Seller User Not Found ", HttpStatus.NOT_FOUND);
	}

	public List<Seller> getAllSellers() {
		
		// TODO Auto-generated method stub
		return sellerDao.findAll();
	}
}