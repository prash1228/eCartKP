/**
 * 
 */
package com.ecartkp.eMall.service;

import com.ecartkp.eMall.model.Cart;

/**
 * @author Koleti Prashanth
 *
 */
public interface CartService {
	void add(Long idCart, Long idProduct, Integer quantity);
}
