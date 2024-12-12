package com.programming.product_service.util;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.programming.product_service.entity.Product;
import com.programming.product_service.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader {

	private final ProductRepository productRepository;

	public void run(String... args) throws Exception {
		if (productRepository.count() < 1) {
			Product product = new Product();
			product.setName("iPhone 13");
			product.setDescription("iPhone 13");
			product.setPrice(BigDecimal.valueOf(1000));

			productRepository.save(product);
		}
	}
}