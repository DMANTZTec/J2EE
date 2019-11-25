package queue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class QueueEx {
public static void main(String args[]) {
	PriorityQueue<String> pq = new PriorityQueue<String>();
	pq.add("priya");
	pq.add("sai");
	pq.add("swetha");
    pq.add("rinky");
    System.out.println(pq.element());
    System.out.println(pq.peek());
    Iterator<String> a = pq.iterator();
    while(a.hasNext()) {
    	System.out.println(a.next());
    }
    pq.remove();
    pq.poll();
    System.out.println(pq);
    
}
}
