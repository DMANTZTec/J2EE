import java.util.TreeSet;

public class treesetex {
	
public static void main(String args[])
{
	TreeSet<Integer> ts =new TreeSet<Integer>();
	ts.add(2);
	ts.add(7);
	System.out.println(ts.pollFirst());
	System.out.println(ts.pollLast());
	
}
}
