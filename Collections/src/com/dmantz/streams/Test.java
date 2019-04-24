package com.dmantz.streams;

public class Test {
	
	
	public static void main(String[]args) {
		
		/*Interf i=(a,b)->System.out.println("The Sum:"+(a+b));	
		i.add(10,20);
		i.add(100, 200);
		i.add(1000, 2000);
		*/
		
		Interf i= n->{return n*n;};
		
		System.out.println("The Square of 10 is:"+i.square(10));
		System.out.println("The Square of 20 is:"+i.square(20));
		

	}
}
