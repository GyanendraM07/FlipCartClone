package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.SimType;

@Repository
public interface SimTypeDao extends JpaRepository<SimType, Integer>{

}
