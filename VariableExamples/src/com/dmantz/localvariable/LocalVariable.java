package com.dmantz.localvariable;

public class LocalVariable {
	
	/*Defination & Declaration ->If we are declaring a variable with in a method or constants or block such type of variables are called
	local variables.
	
	Scope of Local Variable ->Local variables will be created as the part of method execution and will be destroyed once the method
     completes.

	*/
	public static void main(String[] args) {
		
		/*JVM won’t provide any default values. Before using a local variable
		compulsory we should perform initialization explicitly otherwise we will get compile time error.*/		
		final int x=10; //For localvariables only applicable modifier  is final
		System.out.println("The Value of x="+x);	
		
	}

}
