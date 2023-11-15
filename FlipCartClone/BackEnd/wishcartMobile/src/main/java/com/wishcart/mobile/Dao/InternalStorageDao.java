package com.wishcart.mobile.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.mobile.model.InternalStorage;

@Repository
public interface InternalStorageDao extends JpaRepository<InternalStorage, Integer> {

}
