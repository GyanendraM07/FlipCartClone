package com.wishcart.mobile.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "discount")
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String discountName;

	@ManyToMany(mappedBy = "discounts")
	private List<MobileProduct> mobileProducts;
}
