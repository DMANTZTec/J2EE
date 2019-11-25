
import java.util.*;  
public	class AA  
{
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("aaa");  
	  al.add("111");  
	  al.add("bbb");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("111");  
	  al2.add("aaa");  
	  al.retainAll(al2);  
	  Iterator<String>itr=al.iterator();
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  

