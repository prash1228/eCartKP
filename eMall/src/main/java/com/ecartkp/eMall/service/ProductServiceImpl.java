package com.ecartkp.eMall.service;

import java.util.ArrayList;
import java.util.List;

import com.ecartkp.eMall.model.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> findAllProducts(Long idCart) {
		List<Product> products = new ArrayList<Product>();
		Product product1 = new Product(101, "Product 1", 1000, "Product 1 desc", "Cat 1", "image1", 10, 100);
		Product product2 = new Product(102, "Product 2", 1000, "Product 2 desc", "Cat 2", "image2", 10, 100);
		products.add(product1);
		products.add(product2);
		return products;
	}

}
