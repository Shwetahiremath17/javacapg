package com.capg.day;

public class OddNo {
	public static void main(String []arg) {
		int num = 100;
		System.out.println("even no from 1 to 100" +num+ ":");
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i + "");
			}
		}
	}

}
