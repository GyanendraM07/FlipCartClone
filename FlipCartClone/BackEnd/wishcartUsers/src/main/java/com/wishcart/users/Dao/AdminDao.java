package com.wishcart.users.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishcart.users.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

	Optional<Admin> findByUserNameAndPassword(String userName, String password);
}
