import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraListExample {
public static void main(String[] args)
{
	List<String> al = new ArrayList<String>();
	List<Integer> l= new ArrayList<Integer>();
	al.add("sai");
	al.add("priya");
	l.add(1);
	l.add(1);
	System.out.println(l);
	/*Iterator itr = al.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());*/
	for(String s:al)
	System.out.println(s);
	
	
}
}