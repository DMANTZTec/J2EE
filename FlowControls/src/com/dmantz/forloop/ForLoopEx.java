package com.dmantz.forloop;

public class ForLoopEx {
	
	/*
	When : If we  know exact iteration before it's self  and Loop is used to repeat a specific block of code
	        until certain condition is met then we can go forloop     
	
	The most commonly used loop
	Syntax:
	for(initialization section; conditional expression; increment/decrement section)
	{
	//loop body
	}
	
	Initialization section:
    - It is not possible to declare more than 1 variable of different types
    - In the initialization section we are allowed to take any valid java statement including sop also.
    
    Conditional Expression: 
    -  Any expression which should return boolean value.
    -  It is optional & default value is true by compiler
    
    Increment/Decrement section:
    -  Any valid java statement is allowed including System.out.println also
    
    All the 3 parts of for loop are independent of each other & optional

       */
	
	public static void main(String [] args) {
		
		/*int a=1;
		for(int i=0;i<a;i++) {
			
			System.out.println("Hi");
		}
		System.out.println("Hello");
		*/
		int []a = {10,20,30};
		System.out.println("Total Values are " +a.length);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		
		}
		
	}

}
