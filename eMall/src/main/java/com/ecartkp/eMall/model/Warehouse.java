package com.ecartkp.eMall.model;

public class Warehouse {
	private int postal_code;
	private int distance_in_kilometers;
	
	/**
	 * @param postal_code
	 * @param distance_in_kilometers
	 */
	public Warehouse(int postal_code, int distance_in_kilometers) {
		super();
		this.postal_code = postal_code;
		this.distance_in_kilometers = distance_in_kilometers;
	}
	
	/**
	 * @return the postal_code
	 */
	public int getPostal_code() {
		return postal_code;
	}
	/**
	 * @param postal_code the postal_code to set
	 */
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	/**
	 * @return the distance_in_kilometers
	 */
	public int getDistance_in_kilometers() {
		return distance_in_kilometers;
	}
	/**
	 * @param distance_in_kilometers the distance_in_kilometers to set
	 */
	public void setDistance_in_kilometers(int distance_in_kilometers) {
		this.distance_in_kilometers = distance_in_kilometers;
	}
	
	
	@Override
	public String toString() {
		return "Warehouse [postal_code=" + postal_code + ", distance_in_kilometers=" + distance_in_kilometers + "]";
	}
}
