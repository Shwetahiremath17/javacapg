package com.capg.day;
interface Lambda{
	public void print();
}
interface SumInterface{
	public void sum(int a,int b);
}
public class MyLambda {
public static void main(String []args) {
SumInterface sumInterface = (int a, int b) ->{
	int c = a+b;
	System.out.println(c);
	};
	sumInterface.sum(10,10);
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

