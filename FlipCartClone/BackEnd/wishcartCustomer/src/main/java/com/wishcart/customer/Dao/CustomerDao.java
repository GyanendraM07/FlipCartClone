package com.wishcart.customer.Dao;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.customer.models.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByUserNameAndPassword(String userName, String password);

}
