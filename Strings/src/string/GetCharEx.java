package string;

public class GetCharEx { 
	    public static void main(String[] args) {  
	        String str = new String("Welcome to Dmantz");  
	        char[] ch  = new char[20];  
	        try {  
	          //  str.getChars(3, 25, ch, 0); 
	        	str.getChars(7, 10, ch, 0);
	            System.out.println(ch);
	            }
	        
	      catch (Exception e) {  
	            System.out.println(e);  
	        }  
	    }  
	}  

