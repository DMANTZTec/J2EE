package com.example.javaInterface;

import java.util.HashMap;

public class HashMap3 {
	
	public static void main(String args []) {
		
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		
		 hashmap.put("google",100);
		 hashmap.put("infosys",101);
		 hashmap.put("Dell",103);
		 hashmap.put("Oracle",104);
		 hashmap.put("Microsoft",105);
		 hashmap.put("Tcs",106);
		 hashmap.put("Delloit",107);
		 hashmap.put("Apple",108);
		 hashmap.put("Samsung",109);
		 hashmap.put("Nokia",110);
		 hashmap.put("Redmi",111);
		 hashmap.put("China Company",112);
		 
		 System.out.println("Top 12 Companies List:"+ hashmap);
		 
		 hashmap.remove("China Company");
		 hashmap.remove("Redmi");
		 
		 System.out.println("Top 10 Companies List:"+ hashmap);
		 
		 
	}

}
