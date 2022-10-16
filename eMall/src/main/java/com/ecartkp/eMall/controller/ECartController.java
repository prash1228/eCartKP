/**
 * 
 */
package com.ecartkp.eMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecartkp.eMall.exception.ECartException;
import com.ecartkp.eMall.model.Product;
import com.ecartkp.eMall.service.CartService;
import com.ecartkp.eMall.service.ProductService;

/**
 * @author Koleti Prashanth
 *
 */
@RestController
public class ECartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;
	
	@PutMapping(value = "/users/{idUser}/carts/{idCart}")
	public @ResponseBody ResponseEntity<Void> addItemsToCart(@PathVariable("idCart") Long idCart, @RequestParam("idProduct") Long idProduct,
			@RequestParam("quantity") Integer quantity) {
		cartService.add(idCart, idProduct, quantity);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Product>> getItemsInCart(@PathVariable("idCart") Long idCart) throws ECartException {
		List<Product> products = productService.findAllProducts(idCart);
		return new ResponseEntity<List<Product>> (products, HttpStatus.OK);
	}
	
	
}
