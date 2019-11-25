package string;

public class CharAtEx2 {
public static void main(String args[])
{
/*String s="Welcome to Dmantz";
    int l=s.length();
	System.out.println(s.charAt(4));
	System.out.println(s.charAt(l-1));
	for(int i=0;i<s.length()-1;i++)
	  {
		if(i%2==0)
		 {
			System.out.println(i+" "+s.charAt(i));
         }
      }*/
	 String str = "Welcome to dmantz";  
     int count = 0;  
     for (int i=0; i<=str.length()-1; i++) {  
         if(str.charAt(i) == 't') {  
             count++;  
         }  
     }  
     System.out.println("Frequency of t is: "+count);  
	  
	
}
}
