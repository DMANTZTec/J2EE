package com.example.javaInterface;

import java.util.HashMap;

public class HashMap2 {
	public static void main(String args[]) {
		
		HashMap<String,Integer> Hm = new HashMap<String,Integer>();
		
		Hm.put("vijay",100);
		Hm.put("Harsha",101);
		Hm.put("Yashwanth",102);
		Hm.put("santosh",103);
		Hm.put("Sashi",104);
		
		System.out.println("List of HashMap:"+Hm);
		
		Hm.remove("vijay");
		
		System.out.println("Updated list:"+Hm);
		
		Hm.remove("Harsha");
		
		System.out.println("Final List:"+Hm);
		
		
	}

}
