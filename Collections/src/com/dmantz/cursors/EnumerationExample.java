package com.dmantz.cursors;

import java.util.Enumeration;
import java.util.Vector;


/*Enumeration->From the collection object to retrieve object we can use Cursor-Enumeration.
Limitations of Enumeration
===========================
1. It is applicable only for legacy classes and it is not a universal cursor.
2. While iterating the elements by using enumeration we can perform only read operation and we
can’t perform any modify/removal operations.
To overcome these problems we should go for Iterator interface.*/

public class EnumerationExample {
	
	public static void main(String[]args) {
		
		Vector v=new Vector();
		for(int i=0;i<=10;i++) {
			v.addElement(i);;
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();
			if((i%2)==0) {
				
				System.out.println(i);
				
	    	 }
			
			System.out.println(v);
			
		}
		
		
	}

}
