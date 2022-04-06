package com.capg.day;
//ENUM Concept
enum Weeks { Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday
}

public class Days {
	public static void main(String []arg) {
		System.out.println(Weeks.Sunday);
		System.out.println(Weeks.Wednesday);
		System.out.println(Weeks.valueOf("Monday"));
}
}