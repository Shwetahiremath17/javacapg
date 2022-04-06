package com.capg.day;
//ENUM concept
 enum Month { Jan , Feb , Mar , Apr , May , Jun , Jul , Aug , Sep , Oct , Nov , Dec }


public class Months {
	public static void main(String []arg) {
		System.out.println(Month.Jan);
		System.out.println(Month.Nov);
		System.out.println(Month.valueOf("Jun"));
}
}


