package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.Offers;

@Repository
public interface OffersDao extends JpaRepository<Offers, Integer>{

}
