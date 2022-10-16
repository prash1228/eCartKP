package com.ecartkp.eMall.model;

public class Product {
	private long id;
	private String name;
	private int price;
	private String description;
	private String catagory;
	private String image;
	private int discount_percentage;
	private int weight_in_grams;
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param description
	 * @param catagory
	 * @param image
	 * @param discount_percentage
	 * @param weight_in_grams
	 */
	public Product(long id, String name, int price, String description, String catagory, String image,
			int discount_percentage, int weight_in_grams) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.catagory = catagory;
		this.image = image;
		this.discount_percentage = discount_percentage;
		this.weight_in_grams = weight_in_grams;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
	public int getWeight_in_grams() {
		return weight_in_grams;
	}
	public void setWeight_in_grams(int weight_in_grams) {
		this.weight_in_grams = weight_in_grams;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", catagory=" + catagory + ", image=" + image + ", discount_percentage=" + discount_percentage
				+ ", weight_in_grams=" + weight_in_grams + "]";
	}
	
}
