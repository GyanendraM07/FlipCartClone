package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.Discount;

@Repository
public interface DiscountDao extends JpaRepository<Discount, Integer> {

}
