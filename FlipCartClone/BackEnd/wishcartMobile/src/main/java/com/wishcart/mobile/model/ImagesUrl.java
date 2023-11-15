package com.wishcart.mobile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "image_url")
public class ImagesUrl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageUrl;

	@ManyToOne
	private MobileProduct mobileProduct;
}
