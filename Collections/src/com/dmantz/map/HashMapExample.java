package com.dmantz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*HashMap
HashMap is not sorted or ordered. If you just need a Map, and you don’t care about the order of the elements
while iterating through it, you can use a HashMap. That keeps it simple. The values can be null. But the key
should ne unique, so you can have one null value for key. (Allows only one null key).*/

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		hm.put("India","Ts");
		hm.put("bharath", "ap");
		hm.put("A", "null");
		hm.put("B","null" );
		hm.put("null", "A");
		hm.put("null","B" );
		hm.put(100,"santhosh");
		hm.put(100,"santhoshreddy");
		System.out.println(hm);
		hm.replace(100, "SanthoshReddy");
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();	    
	    System.out.println(c);
	    Set s1=hm.entrySet();
	    System.out.println(s1);
	    Object obj=hm.get("India");
	    System.out.println(obj);
	    Boolean b=hm.containsKey("India");
	    System.out.println(b);
	    int i=hm.size();
	    System.out.println(i);
	    
		
		
	}

}
