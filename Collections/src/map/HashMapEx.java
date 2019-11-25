package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
public static void main(String args[])
{
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"red");
	map.put(7, "blue");
	map.put(5,"pink");
	System.out.println(map);
for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	   map.entrySet()    
	      .stream()  
	      .sorted(Map.Entry.comparingByKey())
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
 
	      .forEach(System.out::println);  
}
}