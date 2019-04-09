package com.dmantz.cursors;

import java.util.LinkedList;
import java.util.ListIterator;


/*ListIterator
 * 
 * From the collection object to retrieve object we can use Cursor-ListIterator.
 * 
1.It has introduced in 1.2 version and it is child interface of Iterator.
2.It is a bidirectional cursor.
3.i.e Based on requirement we can move either to the forward or backward direction.
4.While Iterating we can perform replace and add operation in addition to read and remove this
*/
public class ListIteratorExample {
	
	public static void main(String[]args) {
		
		LinkedList l=new LinkedList();
		
		l.add("Santhu");
		l.add("Naru");
		l.add("Sai");
		l.add("Ram");
		l.add("Prasi");
		System.out.println(l);
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			String s=(String)li.next();
			if(s.equals("Santhu")) {
				li.add("Reddy");
			}else if(s.equals("Sai")){
				li.set("Kumar");				
			}else if(s.equals("Ram")) {
				li.add("Reddy");
			}else if(s.equals("Prasi")){
				li.remove();
			}
			System.out.println(l);
		}
		
		
		
		
	}
	
	
	

}
