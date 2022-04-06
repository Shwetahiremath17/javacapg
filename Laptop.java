package com.capg.day;

//Laptop class
//default constructor
//parameterized constructor
//getter for brand setter for brand
//print method for laptop class
public class Laptop {
	int id ;
	String brand;
	public void setID(int id) {
		this.id = id;
	}
	//setter for brand
	public void setBrand(String brand) {
		this.brand= brand;
	}
	//default constructor
	public Laptop() {
		}
	//parameterized constructor
	public Laptop(int id,String brand) {
		this.id = id;
		this.brand = brand;
	}
	public Laptop(int id) {
		this.id= id;
	 }
	public Laptop(String brand) {
		this.brand = brand;
	}
	public void print() {
		System.out.println("id" +this.id);
		System.out.println("brand" +this.brand);
	}
	public int getID() {
		return this.id;
	}
	//getter for brand
	public String getBrand() {
		return this.brand;
	}
}
	


