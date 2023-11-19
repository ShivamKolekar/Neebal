package com.model;

public class Product {
	private int id; 
	 private String name; 
	 private double price;
	private String category;
	
	/*public Product(int i, String string, double j, String string2) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=string;
		this.price=j;
		this.category=string2;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	} 
	

}