package com.example.javaInterface;

import java.util.HashMap;
public class HashMap1 {
	public static void main(String args[]){  
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    

		hm.put(100,"harsha");    
		hm.put(101,"Vijay");    
		hm.put(102,"santosh"); 
		hm.put(103,"yashwanth");

		System.out.print("list of elements: "+hm);

	}
}
