package com.capg.day;

public class MyString1 {

	public static void main(String []arg) {
	String str = "Good Morning";
	String str1 = new String("Good Morning");
	String str2 = "Good Morning";
	if
	(str.equalsIgnoreCase(str1))
	{
		System.out.println("true");
		}
	else
	{
		System.out.println("flase");
	}
	String one = "N";
	String two = "N";
    System.out.println(one.compareTo(two));
    str.charAt(0);
    System.out.println(str.charAt(0));
    System.out.println(str.concat(str2));
    System.out.println(str.contains("Say Hii"));
    byte[] b = str.getBytes();
    System.out.println(str.indexOf("r"));
    String str4="";
    System.out.println(str4.isBlank());
    System.out.println(str.length());
    str.replace("M", "O");
    System.out.println(str.replace("M", "O"));
    System.out.println(str.subSequence(0, 5));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    String str6 = "Good Morning world";
    System.out.println(str6.trim());
    System.out.println(str6);
    System.out.println(str.subSequence(0, 7));
    }
}
