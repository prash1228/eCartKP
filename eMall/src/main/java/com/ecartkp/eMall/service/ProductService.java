package com.ecartkp.eMall.service;

import java.util.List;

import com.ecartkp.eMall.model.Product;

public interface ProductService {
	public List<Product> findAllProducts(Long idCart);
}
