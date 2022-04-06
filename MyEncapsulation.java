package com.capg.day;

class Student
{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id= id;
		this.name = name;
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
		this.name= name;
	}	
}
  
public class MyEncapsulation {
	public static void main(String[] args)
	{
		Student s1 = new Student(1001,"abc");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		}
}
