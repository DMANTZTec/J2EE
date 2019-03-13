package com.dmantz.dowhile;

public class DoWhileEx {
	
	public static void main(String args[]) {
		
		 /* When : If the statement has to execute at least once with out checking the loop
		   condition then we should go for do-while loop.
		*/
		
		int a=10;
		int b=20;

		do {
			System.out.println("In dowhile loop");
		}while(a>b);
		System.out.println("Hi");
	}
}
