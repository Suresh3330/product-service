package com.programming.product_service.controller;

import java.util.List;

import javax.ws.rs.POST;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programming.product_service.dto.ProductRequest;
import com.programming.product_service.dto.ProductResponse;
import com.programming.product_service.entity.Product;
import com.programming.product_service.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;
	
	@PostMapping
	public Product saveProduct(Product product) {
		
		return productService.saveProduct(product);
	}



}
