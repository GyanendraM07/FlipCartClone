package com.wishcart.users.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.users.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByUserNameAndPassword(String userName, String password);

}
