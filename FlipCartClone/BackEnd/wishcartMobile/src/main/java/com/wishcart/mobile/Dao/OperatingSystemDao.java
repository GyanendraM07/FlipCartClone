package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.OperatingSystem;

@Repository
public interface OperatingSystemDao extends JpaRepository<OperatingSystem, Integer> {

}
