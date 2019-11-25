import java.util.Iterator;
import java.util.LinkedList;  
public class RLL{  
 public static void main(String args[]){  
  
  LinkedList<Integer> ll=new LinkedList<Integer>();  
           ll.add(3);  
           ll.add(2);  
           ll.add(1);   
           Iterator<Integer> i=ll.descendingIterator();  
           while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }  
             
 }  
}  