package com.wishcart.mobile.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mobile_product")
public class MobileProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Builder.Default
	private LocalDateTime createdDate = LocalDateTime.now();
	private LocalDateTime updatedDate;
	private int approvedBy;

	@OneToMany(mappedBy = "mobileProduct", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ImagesUrl> images;

	@ManyToMany
	@JoinTable(name = "mobile_offer", joinColumns = @JoinColumn(name = "mobile_id"), inverseJoinColumns = @JoinColumn(name = "offer_id"))
	private List<Offers> offers;

	@ManyToMany
	@JoinTable(name = "mobile_discount", joinColumns = @JoinColumn(name = "mobile_id"), inverseJoinColumns = @JoinColumn(name = "discount_id"))
	private List<Discount> discounts;
	
	private int ramId;
	private int romId;
	private int batteryCapacityId;
	private int screenSizeId;
	private int primaryCameraId;
	private int secondaryCameraid;
	private int brandId;
	private int processorId;
	private int specialityId;
	private int resolutiontypeId;
	private int operatingSystemId;
	private int networkTypeId;
	private int simTypeId;
	private String price;
	private int sellerId;
	@Builder.Default
	private int status=0;
	
	
	
}
