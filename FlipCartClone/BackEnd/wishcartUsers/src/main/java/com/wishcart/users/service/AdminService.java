package com.wishcart.users.service;
import java.util.HashMap;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.wishcart.users.Dao.AdminDao;
import com.wishcart.users.exceptions.CustomException;
import com.wishcart.users.exceptions.CustomExceptionHandler;
import com.wishcart.users.model.Admin;
import com.wishcart.users.serviceImpl.AdminServiceImpl;

@Service
public class AdminService implements AdminServiceImpl {

	//private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

	HashMap<String, Object> response = new HashMap<String, Object>();

	@Autowired
	AdminDao adminDao;

	public ResponseEntity<HashMap<String, Object>> authLogin(String userName, String password) {
		response.clear();
		if (userName.isEmpty() || password.isEmpty())
			throw new CustomException("Username and/or password is Empty", HttpStatus.BAD_REQUEST);
		Optional<Admin> admin = adminDao.findByUserNameAndPassword(userName, password);
		if (admin.isPresent()) {
			response.put("status", HttpStatus.OK.value());
			response.put("message", "Login Succesfull");
			response.put("data", admin.get());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else
			throw new CustomException("Admin User Not Found ", HttpStatus.NOT_FOUND);
	}

}
