package com.rk.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.product.dto.Product;
import com.rk.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		String status = productService.addProduct(product);
		log.info("Product added status = {}",status);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@GetMapping("/productList")
	public List<Product> productList(){
		return productService.listAllProducts();
	}
	
	@GetMapping("/productList/{category}")
	public List<Product> productCategoryList(@PathVariable String category){
		return productService.productCategoryList(category);
	}
	
	@GetMapping("/product/{id}")
	public Product productById(@PathVariable Integer id){
		return productService.productById(id);
	}
	
	@PutMapping("/productUpdate")
	public String updateProduct(@RequestBody Product product){
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/product/{id}")
	public String DeleteProduct(@PathVariable String id){
		return productService.deleteProduct(id);
	}
	
	
	
	
}
