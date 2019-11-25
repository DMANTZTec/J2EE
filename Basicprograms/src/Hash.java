import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hash {
 public static void main(String args[]){  
 ArrayList<String> list=new ArrayList<String>();  
	           list.add("Ravi");  
	           list.add("Vijay");  
	           list.add("Ajay");  
	             System.out.println(list);
	           HashSet<String> set=new HashSet(list);  
	           set.add("Gaurav");  
	           System.out.println(set);
	          Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next()); 
	           }  
	 }  
}
	

