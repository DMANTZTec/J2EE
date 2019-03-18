package com.dmantz.instancevariable;	

public class InstanceVariable {
	
	/*
	Defination -> If the value of a variable is varied from object to object. Such type of variables are called
	instance variables. For every object a separate copy of instance variables will be created.
	
	Declaration -> We have to declare instance variables with in the class but outside of any method (or)
	constructor or block.
	
	Scope of Instance Variables -> Instance variables will be created at the time of object creation and will be destroyed at the
    time of object destruction i.e the scope of instance variables is exactly same as the scope of
     object.
	    
	*/
	
	//For the instance variables if we don't perform any initialization, JVM will always provide the default values.
	//creating instance variable
	int x; 
	public void methodOne() {
		
		System.out.println("The Value of x=" +x);
	}
	
	public static void main(String argd[]) {
		
		InstanceVariable iv=new InstanceVariable();
		//System.out.println("The Value of x=" + iv.x);
		iv.methodOne();
	}

}



