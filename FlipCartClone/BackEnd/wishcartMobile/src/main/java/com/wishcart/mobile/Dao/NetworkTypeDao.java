package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.NetworkType;

@Repository
public interface NetworkTypeDao extends JpaRepository<NetworkType, Integer> {

}
