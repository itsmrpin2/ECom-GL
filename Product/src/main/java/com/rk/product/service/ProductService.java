package com.rk.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rk.product.dto.Product;

@Service
public interface ProductService {
	
	public String addProduct(Product product);

	public List<Product> listAllProducts();

	public List<Product> productCategoryList(String category);

	public Product productById(Integer id);

	public String updateProduct(Product product);

	public String deleteProduct(String id);
}
