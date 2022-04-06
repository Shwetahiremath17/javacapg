package com.capg.day;

class Employee1
{
	private int id;
	private String name;
	private long contactNo;
	private String address;
	
	public Employee1(int id , String name , long contactNo , String address ){
	super();
	this.id = id;
	this.name = name;
	this.contactNo = contactNo;
	this.address = address;
	}
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
	public long getcontactNo() {
		return contactNo;
		}
	public void setcontactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
}
public class MyEncapsulation1 {
	public static void main(String []arg) {
		Employee1 emp = new Employee1(157,"Rajani",9876504321l,"Bangalore");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getcontactNo());
		System.out.println(emp.getaddress());
	}
}
