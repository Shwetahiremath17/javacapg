package com.capg.day;

public class EvenOdd {
	public static void main(String []arg) {
System.out.println(evenOrodd(100));
}
public static int evenOrodd(int e){
if(e % 2 == 0){
System.out.println(e + " is the even number");
return e ;
}
System.out.println(e + " is the odd number");
return e;
}

}
