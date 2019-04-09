package com.dmantz.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*Linked List
=============
->The underlying Data Structure for linked list is doubly linked list.
->Duplicate objects are allowed.
->Insertion order is preserved.
->Heterogeneous objects are allowed.
->‘null’ insertion is possible.
->Implements List, Queue, serializable, clonealbe Interfaces But not RandomAccess*/

public class LinkedListExample {
	
	public static void main(String []args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Santhu");		
		ll.add("new Integer(10)");
		ll.add("Santhu");
		ll.remove(2);
		ll.add("naru");
		ll.add("SSReddy");
		System.out.println(ll);
		ListIterator<String> l=ll.listIterator();
		while(l.hasNext()) {
			Object obj=l.next();
			System.out.println(obj);
	}
		//InterCovertion Between CollectionObjects
				ArrayList<String> al=new ArrayList<String>();
				      al.add("10");
				      al.add("20");
				      al.add("30");
				      System.out.println(al);
				      LinkedList<String> ll1=new LinkedList<String>(al); 
				      ll1.add(1,"15");
				      ll1.add(3,"25");
				      ll1.add(5,"35");
				      System.out.println(ll1);
				      ll1.addFirst("Start");
				      ll1.addLast("Stop");
				      ll1.set(6, "0k");
				      ll1.add(7, "OkDone");
				      ll1.add(8,"Cool");
				      System.out.println(ll1);
	
	
	}
}
