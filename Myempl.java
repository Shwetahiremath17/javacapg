package com.capg.day;
import java.util.ArrayList;
public class Myempl {
	public static void main(String []args) {
		ArrayList<Employee> em = new ArrayList<Employee>();
		em.add(new Employee(1,"shweta",50000));
		em.add(new Employee(2,"soumya",30000));
		em.add(new Employee(3,"soujanya",20000));
		long count =em.stream().map(e->e.getSalary()).count();
		System.out.println(count);
		}
}
