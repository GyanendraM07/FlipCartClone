package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.ScreenSize;

@Repository
public interface ScreenSizeDao extends JpaRepository<ScreenSize, Integer>{

}
