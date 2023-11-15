package com.wishcart.users.service;
import java.util.HashMap;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.wishcart.users.Dao.CustomerDao;
import com.wishcart.users.exceptions.CustomException;
import com.wishcart.users.model.Customer;
import com.wishcart.users.serviceImpl.CustomerServiceImpl;

@Service
public class CustomerService implements CustomerServiceImpl {

	@Autowired
	CustomerDao customerDao;

	HashMap<String, Object> response = new HashMap<>();

	public ResponseEntity<HashMap<String, Object>> registerCustomer(Customer customer) {
		response.clear();
		if (customer != null) {
			customerDao.save(customer);
			response.put("status", HttpStatus.OK);
			response.put("msg", "Customer Register Succesfully !!!");
			return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
		} else
			throw new CustomException("Customer data is null or empty", HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<HashMap<String, Object>> customerAuthLogin(String userName, String password) {
		response.clear();
		if (userName.isEmpty() || password.isEmpty())
			throw new CustomException("Username and/or password is Empty", HttpStatus.BAD_REQUEST);
		Optional<Customer> customer = customerDao.findByUserNameAndPassword(userName, password);
		if (customer.isPresent()) {
			response.put("status", HttpStatus.OK.value());
			response.put("message", "Login Succesfull");
			response.put("data", customer.get());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else
			throw new CustomException("Customer User Not Found ", HttpStatus.NOT_FOUND);
	}
}
