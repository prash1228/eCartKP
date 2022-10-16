package com.ecartkp.eMall.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class warehouseServiceImpl implements WarehouseService {

	@Override
	public String getValueOfCart(int postal_code) {
		// invoking external api to get distance
		String jsonRequest = "", url = "";
		String distance = callRest(jsonRequest, url);
		String shippingCharges = calculateShippingCharges(distance);
		
		return shippingCharges;
	}

	private String calculateShippingCharges(String distance) {
		//logic is pending
		return "201";
	}

	private String callRest(String jsonRequest, String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(jsonRequest, headers);
		return restTemplate.postForObject(url, entity, String.class);
	}

}
