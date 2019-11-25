package queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeEX {
public static void main(String args[])
{
	Deque<Integer> ab = new ArrayDeque<Integer>();
	ab.offer(1);
	ab.add(3);
	ab.offer(6);
	ab.offerFirst(0);
	ab.poll();
	ab.pollFirst();
	ab.pollLast();
	System.out.println(ab);
	
	for(Integer i :ab)
	{
		System.out.println(i);
	}
	
}

}
