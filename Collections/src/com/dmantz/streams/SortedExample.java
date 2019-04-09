package com.dmantz.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Collection -> If we want represent a group of  objects as a single entity then we should go for Collection.

Steram ->If we want Process objects from the collection then we should go for Stream.

sorted ->It will sort the elements based on condition.

*/


public class SortedExample {
	
	public static void main(String[]args) {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(75);
	al.add(10);
	al.add(40);
	al.add(30);
	al.add(25);
	
	System.out.println(al);
	
	  //List<Integer> l=al.stream().sorted().collect(Collectors.toList());//AscendingOrder
	  //List<Integer> l=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());//DescendingOrder
	  //List<Integer> l=al.stream().sorted((i1,i2)->1).collect(Collectors.toList());//InsertionOrder
	    List<Integer> l=al.stream().sorted((i1,i2)->-1).collect(Collectors.toList());//ReverseOfInsertionOrder
	    
	System.out.println(l);
}
	
}
	
	
	
	
	


