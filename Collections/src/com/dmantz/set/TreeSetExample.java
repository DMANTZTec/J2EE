package com.dmantz.set;

import java.util.TreeSet;

/*TreeSet->
->The underlying Data structure for the TreeSet is Balanced tree.
->Duplicate objects are not allowed. If we are trying to insert duplicate object we won’t get any
  compile time error or Run time error, add method simply returns false.
->Insertion order is not preserved but all the elements are inserted according to some sorting order.
->Heterogeneous objects are not allowed, violation leads to Run time error saying class cast Exception.
*/

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("null");
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("A");
		
	
		System.out.println(ts);
		
	}
	

}
