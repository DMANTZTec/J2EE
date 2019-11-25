import java.util.*;  
public class LLExample{
	public static void main(String args[]){  
    LinkedList<String> list=new LinkedList<String>();  
	list.add("aaa");  
	list.add("bbb");  
    String s=list.get(0);
	System.out.println("element is: "+s);  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

