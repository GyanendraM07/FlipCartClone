package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.ProcessorBrand;

@Repository
public interface ProcessorBrandDao extends JpaRepository<ProcessorBrand, Integer> {

}
