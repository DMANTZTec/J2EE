package com.dmantz.streams;

import java.util.ArrayList;


/*Collection -> If we want represent a group of  objects as a single entity then we should go for Collection.

Steram ->If we want Process objects from the collection then we should go for Stream.

Min->Its give the min value in the elements.

Max->Its give  the max value in the elements.

*/

public class MinMaxExample {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(75);
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(25);
		
		System.out.println(al);
		
		Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();		
		System.out.println(min);		
		Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();		
		System.out.println(max);
				
	}
	

}
