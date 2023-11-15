package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.Camera;

@Repository
public interface CameraDao extends JpaRepository<Camera, Integer> {

}
