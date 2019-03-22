package com.dmantz.inheritance;

/*It is the mechanism by which one class is allow to inherit the features(fields and methods) of another class
By using extends keyword we can implement inheritance.
The main advantage is reusability.
*/

public class Maruti800 extends Maruti {
	
	public Maruti800() {
		
		System.out.println("Maruti Model:800");
	}
	public void m800Speed() {
		System.out.println("Maruti800 Speed:100kmph");
		
	}
	public static void main(String []args) {
     Maruti800 m8=new Maruti800();
  
     m8.vehicleType();
     m8.brand();
     m8.speed();
     m8.m800Speed();
    
}
}
