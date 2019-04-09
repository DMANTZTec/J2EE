package com.dmantz.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Collection -> If we want represent a group of  objects as a single entity then we should go for Collection.

Steram ->If we want Process objects from the collection then we should go for Stream.

map -> On Every object if we want to do some operation then we should go for map.
*/

public class AddOperationOnObject {
	
public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println(al);
		
    List<Integer> l=al.stream().map(i->i+5).collect(Collectors.toList());
    
    System.out.println(l);
		
		
}

}
