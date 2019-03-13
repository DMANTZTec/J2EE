package com.dmantz.breakstmt;

public class BreakEx {
	
	/*Break
	It can be used in the following places.
	1) with in the loops to come out of the loop.
	2) Inside switch statement to come out of the switch .
	3) If we are using break any where else we will get a compile time error.
*/
	
public static void main (String[] args){
		
		int x=10;
		 
		 if(x!=10) {			 
			 //break;  break statement cannot be used outsisde loop or switch
			  System.out.println(x);
			}else {
				System.out.println("value is not matched");
			}	 
		 
		
		switch(x) {
		case 1:
			System.out.println("Searching Started");
			break;
		case 10:
			System.out.println("Value is Matched");
			break;

}
}
}