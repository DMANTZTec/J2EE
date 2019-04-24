package com.dmantz.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SquareOfElements {
	
	
	public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println(al);
		
		
		Consumer<Integer> c=i->System.out.println("THe Sqaure of "+i+" is:"+(i*i));
				
		al.stream().forEach(c);
		
		
	}
}
