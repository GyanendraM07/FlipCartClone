package com.wishcart.seller.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
