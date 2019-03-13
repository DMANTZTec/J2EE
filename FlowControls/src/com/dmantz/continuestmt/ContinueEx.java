package com.dmantz.continuestmt;

public class ContinueEx {
	
	/*continue
	1) we should use ‘continue’ only in the loops to skip current iteration & continue for the next
	iteration.
	2) If we are using ‘continue’ any where except loops we will get compile time error saying
	“continue out side of loop”.
	*/
	
	public static void main(String []args) {
		
		for(int i=0;i<10;i++) {
			
			if(i%2==0) 
				continue;
				System.out.println(i);
				
			}
		
	}

}
