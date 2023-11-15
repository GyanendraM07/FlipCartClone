package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.Ram;

@Repository
public interface RamDao extends JpaRepository<Ram, Integer>{

}
