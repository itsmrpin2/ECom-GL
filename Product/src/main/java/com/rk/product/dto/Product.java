package com.rk.product.dto;

import java.util.List;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
	
	@Id
	private String id;
	
	private String name;
	
	private Category category;
	
	private double price;
	
	private String currency;
	
	private double discount;

	private double discountDiscription;

	private List<String> imageURLs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscountDiscription() {
		return discountDiscription;
	}

	public void setDiscountDiscription(double discountDiscription) {
		this.discountDiscription = discountDiscription;
	}

	public List<String> getImageURLs() {
		return imageURLs;
	}

	public void setImageURLs(List<String> imageURLs) {
		this.imageURLs = imageURLs;
	}
	
}
