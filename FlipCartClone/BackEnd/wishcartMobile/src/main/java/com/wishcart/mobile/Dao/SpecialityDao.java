package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.Speciality;

@Repository
public interface SpecialityDao extends JpaRepository<Speciality, Integer>{

}
