package com.dmantz.staticvariable;

public class StaticVariable {
	
	/*Defination -> if the value of a variable is fixed for all objects , Such type of variables we have to declare at class level by using static keyword.
	 
	 Declaration -> Static variables should be declared with in the class but outside of any method or block or
                    constructor 
                    
     Scope of static variable ->Static variables will be created at the time of class loading and destroyed at the time of unloading.
	 
	*/
	
	
	//For the static variables if we dont perform any initialization JVM will always provide default values
	  static int x;     
	//create and initialize static variable
	static int y=20; 
	public static void main(String []args) {
	StaticVariable sv=new StaticVariable();
	System.out.println("The Value of x=" +sv.x);	
	//Not Recemended to call StaticVariable in this way but valid
	System.out.println("The Value of y=" +sv.y);	
	 //Recemended to call StaticVaribles in this way and valid
	System.out.println("The Value of z=" +StaticVariable.y);
	
	/*sv.x=100;
	sv.y=200;
	
	StaticVariable sv1=new StaticVariable();
	System.out.println(sv1.x+ " " +sv1.y);*/
	
	}
	
	}
