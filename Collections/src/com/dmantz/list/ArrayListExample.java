package com.dmantz.list;

import java.util.ArrayList;
import java.util.ListIterator;

/*Collection   ->   This can be used for representing a group of individual objects as a single entity
 *ListInterface-> This can be used for representing a group of individual objects where insertion order is preserved and
                   duplicate objects are allowed.
                     
 ArrayList
 =========                  
->The underlying data Structure for ArrayList() is resizable Array or “Growable Array.
->Duplicate objects are allowed.
->Insertion order is preserved.
->Heterogeneous objects are allowed.
->‘null’ insertion is possible.
                   
                   
  */

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
	al.add("Santhu");		
	al.add("new Integer(10)");
	al.add("Santhu");//Duplicates are allowed
	al.remove(2);
	al.add("naru");
	al.add("SSReddy");
	System.out.println(al);
	ListIterator<String> l=al.listIterator();
	while(l.hasNext()) {
		Object obj=l.next();
		System.out.println(obj);
		/*boolean b=l.hasPrevious();
		System.out.println(b);
		boolean b1=l.hasNext();
		System.out.println(b1);
		*/
	}
	
	
	
	
	
	
	
			
			
		
		
		
	}
	

}
