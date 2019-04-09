package com.dmantz.cursors;

import java.util.ArrayList;
import java.util.Iterator;


/*Iterator
 * 
 * From the collection object to retrieve object we can use Cursor-Iterator.
 * 
o Introduced in 1.2 version.
o We can get Iterator Object for any collection incremented class i.e it is universal cursor.
o By iterating the elements we can perform remove operation also in addition to read operation
Limitations
===========
1. Enumeration and Iterator are single directional cursors. They can always move to words forward
direction only.
2. By using Iterator we can perform read and remove operations. And we can’t perform any replace or
addition of new objects
To over come these limitations we should go for list Iterator interface().
*/
public class IteratorExample {
public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		for(int i=0;i<=10;i++){
			al.add(i);
			
		}
		System.out.println(al);
       Iterator it=al.iterator();
       while(it.hasNext()){
    	 Integer i=(Integer)it.next();
    	 if(i%2==0){
    		 
    		 System.out.println(i);
    	 }else{
    		 it.remove();
    	 }
    	 
       }
       System.out.println(al);
	}

}
