package com.rk.product.dto;

import java.util.List;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 91760
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	private String id;
	
	private String name;
	
	private Category category;
	
	private double price;
	
	private String currency;
	
	private double discount;

	private String discountDiscription;

	private List<String> imageURLs;

}
