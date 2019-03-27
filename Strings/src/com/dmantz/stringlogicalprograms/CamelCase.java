package com.dmantz.stringlogicalprograms;

import java.util.Scanner;

public class CamelCase {
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String data=sc.nextLine();		
		String[] s=data.split("");
		for(String strr:s) {
			char x=strr.charAt(0);
		   char y=Character.toUpperCase(x);
		          String sub=strr.substring(1);
		          System.out.print(y+sub);
			
		}
	}

}
