package com.capg.day;
interface Lambda{
	public void print();
}
interface SumInterface{
	public void evenOdd(int e);
}
public class MyLambdaEAndO {
public static void main(String []args) {
SumInterface sumInterface = (int e) ->{
	if(e % 2 == 0){
		System.out.println(e + " is the even number");
		};
	sumInterface.evenOdd(10,10);
	Lambda lam= () ->{
	System.out.println("Hello Java");	
	};
	lam.print();
	Lambda l=()->System.out.println("Hello") ;
	}
	public static void print() {
	System.out.println("Hello Java");
	}
public static void addingNumber(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
}

