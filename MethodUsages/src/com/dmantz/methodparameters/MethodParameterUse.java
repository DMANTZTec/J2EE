package com.dmantz.methodparameters;

import java.util.Scanner;

public class MethodParameterUse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MethodWithParameter mp = new MethodWithParameter();

		System.out.println("Enter Ur Name");

		String name = sc.nextLine();

		mp.simpleMessage(name);
	}

}
