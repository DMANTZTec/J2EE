package com.dmantz.methodinstances;

import java.util.Scanner;

public class MethodInstances {

	public static void main(String args[]) {

		// Scanner sc=new Scanner(System.in);

		/*
		 * At the time of Object Creation some peace of code will execute automatically
		 * to perform initialization that peace of code is nothing but “Constructor"
		 * Hence the main Objective of constructor is to perform initialization.
		 */
		ManyMethods mm = new ManyMethods("Sweety");

		/*
		 * System.out.println("Enter ur first gf here: ");
		 * 
		 * String temp=sc.nextLine();
		 * 
		 * mm.setName(temp);
		 */

		mm.says();

	}

}
