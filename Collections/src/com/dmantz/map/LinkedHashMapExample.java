package com.dmantz.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/*LinkedHashMap
LinkedHashMap will keep the order in which the elements are inserted into it. If you will be adding and
removing elements a lot, it will be better to use HashMap, because LinkedHashMap will be slower to do
those operations. But, you can iterate faster using LinkedHashMap. So, if you will be iterating heavily, it
may be a good idea to use this*/

public class LinkedHashMapExample {
	
	public static void main(String[]args) {
		
		LinkedHashMap hm=new LinkedHashMap();
		
		hm.put("India","Ts");
		hm.put("bharath", "ap");
		hm.put("A", "null");
		hm.put("B","null" );
		hm.put("null", "A");
		hm.put("null","B" );
		hm.put(100,"santhosh");
		hm.put(100,"santhoshreddy");
		System.out.println(hm);
		int i=hm.size();
		System.out.println(i);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
		
		
	}

}
