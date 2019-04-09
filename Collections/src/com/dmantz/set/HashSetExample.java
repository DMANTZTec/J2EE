package com.dmantz.set;

import java.util.HashSet;
import java.util.Iterator;

/*HashSet
------
The underlying Data Structure for HashSet is Hashtable.
Insertion order is not preserved and it is based on has code of the Object.
Duplicate objects are not allowed. Violation leads to no CompileTimeError or RuntimeError, add
method simply returns false.
‘null’ insertion is possible.	
Heterogeneous objects are allowed.
HashSet is the best choice if the frequent operation is Search Operation

*/
public class HashSetExample {
	public static void main(String[] args) {

	       HashSet<String> hs=new HashSet<String>();
	       hs.add("santhu");
	       hs.add("naru");
	       hs.add("ram");
	       hs.add("sai");
	       hs.add("prasi");
	       hs.add("null");
	      System.out.println(hs.add("santhu"));     
	       //Display element by element by using iterator
	       Iterator it=hs.iterator();
	       while(it.hasNext()){
	    	   Object ob=it.next();
	    	   System.out.println(ob);
	    	}
	       System.out.println("Elements are:"+hs);   
	    	Iterator i=hs.iterator();
	        boolean b1=i.hasNext();
	    	System.out.println("Bl:"+b1);
	    	boolean b2=hs.isEmpty();
	    	System.out.println("B2:"+b2); 
	    	Boolean b3=hs.contains("santhu");
	    	System.out.println("B3:"+b3);
	    	hs.clear();
	    	System.out.println("hs:"+hs);
	    	Boolean b4=hs.isEmpty();
	    	System.out.println("B4:"+b4);
	    	hs.size();
	    	System.out.println("hs1:"+hs);
	    	
		
		
	}
	

}
