package com.dmantz.swap;

import java.util.Scanner;

public class Swap {
	
	public static void main (String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		int i=sc.nextInt( );
		int a=i;
		
		System.out.println("Enter B");
		
		int j=sc.nextInt();
		int b=j;
		
		System.out.println("Before Swapping A "+a);		

		System.out.println("Before Swapping B "+b);
		
		a=a+b; //if suppose a=10,b=20 -> a=10+20=30 ->here A becomes 30
		
		b=a-b; //b=30-20=10 ->here B becomes  10
		
		a=a-b; //a=30-10=20 ->here A becomes 20
		
		//Now  A becomes 20 and B becomes 10 this is swapping of two numbers
				
        System.out.println("After Swapping A "+a);		

		System.out.println("After Swapping B "+b);
		
		}

}
