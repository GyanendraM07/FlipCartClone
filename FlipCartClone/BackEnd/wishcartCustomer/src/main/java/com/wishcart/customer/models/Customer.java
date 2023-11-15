package com.wishcart.customer.models;
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
@Table(name="customer_user")
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String FullName;
	private String email;
	private String userName;
	private String contactNumber;
	private String password;
	private String companyAddress;
	private int active;
	@Builder.Default
	private LocalDateTime createdDate=LocalDateTime.now();
	private LocalDateTime updateDate;
	private LocalDateTime approvedDate;
	private int approvedBy;
}
