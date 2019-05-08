package com.dmantz.streams;

/*Supplier:Just supply my required objects and it wont take any input

Supplier->get()
*/

import java.util.function.Supplier;

public class SupplierFI {
	
	public static void main(String[] args) {
		
		Supplier<String> s=()->{
			
		String otp="";
		
		for(int i=0;i<6; i++) {
			
			otp=otp+(int)(Math.random()*10);
						
		}
		
		return otp;
						
		};
		
		System.out.println("Your OTP is Generated Please dont Share With Anyone: " +s.get());
		
	}

}
