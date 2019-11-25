package string;
import java.util.ArrayList;
public class StringEqualsEx {
	 
	  
	    public static void main(String[] args) {  
	        String str1 = "brown";  
	        ArrayList<String> list = new ArrayList<>();  
	        list.add("red");   
	        list.add("blue");  
	        list.add("green");  
	        list.add("brown");  
	        for (String str : list) {  
	            if (str.equals(str1)) {  
	                System.out.println("brown is present");  
	            }  
	        }  
	    }  
	}  

