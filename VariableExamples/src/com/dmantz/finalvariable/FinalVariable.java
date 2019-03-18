package com.dmantz.finalvariable;

public class FinalVariable {
	
	/*JVM won’t provide any default values. Before using a final instance,final static,final local variable
	compulsory we should perform initialization explicitly otherwise we will get compile time error.*/
	
	/*The following are the places to perform FinalInstance Variable 
	1) At the time of declaration:.
	final int i = 0;
	2) Inside instance initialization class
         final int i;
        {
        i = 0;
          }
       3) Inside constructor
           final int i;
             test()
           {
            i = 0;
             }
             
        */
	
	/*We can perform initialization for the final static variables in the following places.
	1) At the time of declaration
	final static int i = 0;
	2) Inside static blocks
	static
	{
	i = 0;
	}
     */
	
	/*We can perform initialization for the final lacal variables in the following places.
	
	1) Inside the method
	void m1()
	{
	final int i = 0;
	}
     */
	//create and initialize final instance variable
	final int x=10; 
	//create and initialize final static variable
	static final int y=20;
	public static void main (String [] args) {
		//create and initialize final local variable
		final int z=30;
		FinalVariable fv=new FinalVariable();		
		System.out.println("The Value of x=" +fv.x);
		System.out.println("The Value of y=" +fv.y);
		System.out.println("The Value of z=" +z);
	}
		
}
