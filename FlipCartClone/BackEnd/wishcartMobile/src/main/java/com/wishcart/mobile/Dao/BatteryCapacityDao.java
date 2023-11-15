package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.BatteryCapacity;

@Repository
public interface BatteryCapacityDao extends JpaRepository<BatteryCapacity, Integer>{

}
