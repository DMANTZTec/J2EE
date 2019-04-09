package com.dmantz.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

/*HashTable
Hashtable is almost the same as HashMap. The main differences are:
1. Hashtable does not let you have null value for key.
2. The key methods of Hashtable are synchronized. So, they may take a longer time to execute, compared to
HashMap’s methods*/

public class HashTableExample {
	
	public static void main(String[]args) {
		
		Hashtable ht=new Hashtable();
		ht.put("india", "ts");
		ht.put("bharath", "ap");
		ht.put("A", "null");
		ht.put("B","null" );
		ht.put("null", "A");
		ht.put("null","B" );
		ht.put(100,"santhosh");
		ht.put(100,"santhoshreddy");
		System.out.println(ht);
		Set s=ht.keySet();
		System.out.println(s);
		Collection c=ht.values();
		System.out.println(c);
	

		
		
	}
	
	

}
