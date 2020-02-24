package com.learning.ownpratice.model;

public class Product {

	private int id;
	private String pname;
	private String description;
	private String seller;
	private double price;
	
	public Product(int id, String pname, String description, String seller, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.description = description;
		this.seller = seller;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	
}
