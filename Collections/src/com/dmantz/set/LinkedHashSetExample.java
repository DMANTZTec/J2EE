package com.dmantz.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	/*Set->This can be used for representing a group of Individual objects where insertion order is not preserved and
	duplicate objects are not allowed.
	
	Note:- For implementing caching application the best suitable Data structure is LinkedHashSet and
           LinkedHashMap where duplicate objects are not allowed and insertion order Must be preserved
	
	*/
	public static void main(String[] args) {
		
		HashSet<String> hs=new LinkedHashSet<String>();
		hs.add("santhu");
		hs.add("naru");
		hs.add("ram");
		hs.add("sai");
		hs.add("prasi");
		hs.add("santhu");
		hs.add("null");
		System.out.println(hs);
		System.out.println(hs.add("ram"));
		//Display  element by using iterator
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {			
			Object obj=it.next();			
			System.out.println(obj);
			
		}
		
		
		
		
		
		
	}

}
