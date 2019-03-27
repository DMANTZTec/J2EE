package com.dmantz.stringlogicalprograms;

public class StringCaps {
	
	public static void main(String []args) {
		
			String str=new String("all the best");
			String str1=new String("ALL THE BEST");
			int i=str.length();
			System.out.println("The above String length is :: " +i);
			
			String s=str.toUpperCase();
			System.out.println(s);
			
			String s1=str1.toLowerCase();
			System.out.println(s1);
			
	}
	

}
