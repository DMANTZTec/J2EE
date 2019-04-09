package com.dmantz.list;

import java.util.Vector;


/*Vector
======
->The underlying Data structure for the vector is resizable array or growable array.
->Insertion order is preserved.
->Duplicate objects are allowed.
->‘null’ insertion is possible.
->Heterogeneous objects are allowed.
->Best choice if the frequent operation is retrieval.
->Worst choice if the frequent operation is insertion or deletion in the middle.
->Vector class implemented serializable, cloneable and RandomAccess Interfaces.
*/
public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		
		System.out.println(v.capacity());
		for(int i=0;i<10;i++){
			
			v.addElement("i");
			
		}
		
		System.out.println(v.capacity());
		v.addElement("Santhu");

		System.out.println(v.capacity());	
		
		
	}

}
