package com.capg.day;
//main method
public class LaptopMain {
  public static void main(String []args) {
	  Laptop laptop = new Laptop();
	  laptop.setID(100);
	  laptop.setBrand("Dell");
	   System.out.println(laptop.getID());
	   System.out.println(laptop.getBrand());

}
}