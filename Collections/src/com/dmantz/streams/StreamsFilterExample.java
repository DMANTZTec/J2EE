package com.dmantz.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

/*Collection -> If we want represent a group of  objects as a single entity then we should go for Collection.

Steram ->If we want Process objects from the collection then we should go for Stream.

Filter ->To filter some elements based on some condition then we should go for FIlter.
*/
public class StreamsFilterExample {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		
		System.out.println(al);
		
	List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());//Filtering only Even Numbers
	System.out.println(l);
		
		
		
	}

}
