package com.supermarket.vo;

public class Product {

	private String itemId;
	private String name;
	private double price;
	private double discount;
	private Integer quantity;

	
	public Product(String itemId, String name, double price, double discount, Integer quantity) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}
	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
	
}
