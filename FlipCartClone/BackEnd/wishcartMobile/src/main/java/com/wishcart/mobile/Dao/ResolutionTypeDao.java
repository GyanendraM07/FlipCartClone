package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.ResolutionType;

@Repository
public interface ResolutionTypeDao extends JpaRepository<ResolutionType, Integer> {

}
