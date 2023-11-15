package com.wishcart.users.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="seller_user")
public class Seller {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String userName;
	private String password;
	private String FullName;
	private String email;
	private String contactNumber;
	private String companyName;
	private String registrationNumber;
	private String gstNumber;
	private String companyAddress;
	private int active;
	@Builder.Default
	private LocalDateTime createdDate=LocalDateTime.now();
	private LocalDateTime updateDate;
	private LocalDateTime approvedDate;
	private int approvedBy;
}
