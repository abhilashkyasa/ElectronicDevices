package com.example.ElectronicsDevices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Electronics {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String category;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this .id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Electronics() {
		super();
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ",name=" +name + ", category=" + category + ",price=" + price + "]";
	}
}
