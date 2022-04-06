package com.capg.day;


public class EmployeeMain {
    public static void main(String[] args) {
	      //creating the object 
	      //object will store in heap memory
	      Employee raj = new Employee();
	      raj.setID(1001);
	      raj.setName("Raj");
	      raj.setSalary(1000.00);
	      // raj.print();
	      System.out.println(raj.getID());
	      System.out.println(raj.getName());
	      System.out.println(raj.getSalary());
	  }
	}
//create POJO class for student 5 attribute and some method
//create class for mobile
//create class for car
//create class for fan
//one class by yourself