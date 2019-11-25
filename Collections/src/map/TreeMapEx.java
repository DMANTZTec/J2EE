package map;
	import java.util.*;  
public class TreeMapEx{  
public static void main(String args[]){  
	   NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");  
       System.out.println(map.descendingMap());
       System.out.println(map.tailMap(101,true));
       System.out.println(map.headMap(102,false));
       System.out.println(map.subMap(101,false,103,true));
}
	}
