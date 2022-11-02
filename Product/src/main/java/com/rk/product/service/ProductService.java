package com.rk.product.service;

import org.springframework.stereotype.Service;

import com.rk.product.dto.Product;

@Service
public interface ProductService {
	
	public String addProduct(Product product);
}
