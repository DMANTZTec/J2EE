import java.util.HashSet;
import java.util.Iterator;

public class hashsetex {
public static void main(String args[])
{
	
	HashSet<String> s = new  HashSet<String>();
	s.add("white");
	s.add("red");
	s.add("pink");
	s.add("white");
	s.remove("white");
	System.out.println(s);
	HashSet<String> s1 = new HashSet<String>();
	s1.add("yellow");
	s1.add("blue");
	s.addAll(s1);
	System.out.println(s);
	s.removeAll(s1);
	System.out.println(s);
	s.removeIf(str->str.contains("red"));
	System.out.println(s);
	s.clear();
	System.out.println(s);
	
	/*Iterator<String> i = s.iterator();
	while(i.hasNext())
			{
		System.out.println(i.next());
			}*/
	
}
}
