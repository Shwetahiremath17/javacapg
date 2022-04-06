package com.capg.day;

import java.util.Scanner;

public class MyArray {
  public static void main(String []arg) {
	  String arr[]= new String [5];
	  long[] arr1 = new long[5];
	  double arr2[] = {1,2,3,4,5};
	  short[] arr3 = {1,2,3,4,5};
	  Scanner sc = new Scanner(System.in);
	  for(int i = 0; i<arr.length;i++) {
		  System.out.println("Enter the value of index" +i);
		  arr[i] = sc.nextInt();
		   }
	  for(int i=0;i<arr.length;i++) {
		  System.out.println("Enter the value of index" + i + "" + arr[i]);
		  }
  }
}
