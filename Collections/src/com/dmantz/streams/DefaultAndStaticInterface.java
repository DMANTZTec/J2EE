package com.dmantz.streams;

/*Default Method:
----------------
->Without effecting implementation classes  if we want to  add new method to the interface that is DefaultMethod. 

*Static Method:
--------------
->If everything is static methods no need to go to class we can define all static methods in Interface only 
so to define  general utility methods inside interface with static 	

->we should call interface static methods using Interface name only there is no other way...
*/
public interface DefaultAndStaticInterface {
	
	public void m1();
	public void m2();
	
	default void m3() {
		
		System.out.println("This is Default Method");
	}
	
	public static void m4() {
		
		System.out.println("This is Interface Static Method");
	}

}
