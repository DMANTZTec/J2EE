package com.dmantz.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ToArrayExample {
	
	
public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println(al);
		
		Integer[] i=al.stream().toArray(Integer[]::new);
		
		/*for(Integer i1:i) {
			
			System.out.println(i1);
		}*/
		
		Stream.of(i).forEach(System.out::println);
		
}
	

}
