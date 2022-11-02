package com.rk.product.dto;

import javax.persistence.Id;

import lombok.Data;


/**
 * @author 91760
 *
 */
 
@Data
public class Category {

	@Id
	private Integer id;
	private String name;
	private String brand;
}
