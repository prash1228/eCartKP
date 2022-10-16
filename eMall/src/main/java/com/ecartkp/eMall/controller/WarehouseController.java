/**
 * 
 */
package com.ecartkp.eMall.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecartkp.eMall.exception.ECartException;
import com.ecartkp.eMall.service.WarehouseService;

/**
 * @author Koleti Prashanth
 *
 */
@RestController("/warehouse")
public class WarehouseController {

	private WarehouseService warehouseService;
	
	@RequestMapping(value = "/distance?distance={postal_code}")
	public @ResponseBody ResponseEntity<String> getValueOfCart(@PathVariable("postal_code") Integer postal_code) throws ECartException  {
		String warehouse = warehouseService.getValueOfCart(postal_code);
		return new ResponseEntity<String> (warehouse, HttpStatus.OK);
	}
	
}
