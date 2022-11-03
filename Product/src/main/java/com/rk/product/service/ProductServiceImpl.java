package com.rk.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rk.product.dto.Product;

public class ProductServiceImpl implements ProductService {
	
	List<Product> products = new ArrayList<>(); 
	
	@Override
	public String addProduct(Product product) {
		
		products.add(product);
		
		return "Success";
	}
	
	@Override
	public List<Product> listAllProducts() {
		return products;
	}
	
	@Override
	public List<Product> productCategoryList(String category) {
		return  products.stream()
				.filter(product -> product.getCategory().getName().equalsIgnoreCase(category))
				.collect(Collectors.toList());
		
	}
	
	@Override
	public Product productById(Integer id) {
		return products.stream().filter(product->product.getId().equals(id)).findAny().get();
	}
	
	@Override
	public String updateProduct(Product product) {
		for(Product prod: products) {
			if(prod.getId()==product.getId()) {
				prod.setName(product.getName());
				prod.setCategory(prod.getCategory());
				prod.setPrice(prod.getPrice());
				prod.setCurrency(prod.getCurrency());
				prod.setDiscount(prod.getDiscount());
				prod.setDiscountDiscription(prod.getDiscountDiscription());
				prod.setImageURLs(prod.getImageURLs());
				
				return "Product Updated Successfully :)";
			}
		}
		return "Product Updation Failed :(";
	}
	
	@Override
	public String deleteProduct(String id) {
		for(Product product : products) {
			if(product.getId()== id) {
				products.remove(product);
				return "Product Deleted...";
			}
		}
		return "Product Deletation Failed...";
	}
	
	

}
