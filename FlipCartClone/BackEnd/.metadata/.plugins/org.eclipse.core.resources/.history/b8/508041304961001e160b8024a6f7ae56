package com.wishcart.users.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.users.model.Seller;

@Repository
public interface SellerDao extends JpaRepository<Seller, Integer> {

	Optional<Seller> findByUserNameAndPassword(String userName, String password);

}
