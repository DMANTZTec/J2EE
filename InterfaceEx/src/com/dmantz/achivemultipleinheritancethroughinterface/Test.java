package com.dmantz.achivemultipleinheritancethroughinterface;
/*Intoduction
From the client point of view interface defines the set of services what he is getting. 
From the service provider point of view an interface defines the set of services what he is offering.
Hence an interface acts as a contract between client and service provider

->A class can extends only one class at a time. But an interface can extends any no of interfaces simultaneously.
->But an interface can’t implement another interface
->Every Interface method is by default public and abstract whether we r declaring or not.
->An interface can contain variables also every interface variable is by default public static and final whether we r declaring or not
*/
public class Test implements A,B {

	@Override
	public void methodOne() {
				
		System.out.println("Iam in both interfaces");

		
	}
	public static void main(String [] args) {
		Test t=new Test();
		t.methodOne();
		System.out.println("Apple rs = " +A.apple);
		System.out.println("Apple rs = " +B.apple);
		
   }
		
}
