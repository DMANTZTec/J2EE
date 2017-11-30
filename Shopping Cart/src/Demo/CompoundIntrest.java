package Demo;

import java.util.Scanner;

public class CompoundIntrest {
	
	public CompoundIntrest(int p, int n ,float r) {
		
		for(int i = 1; i <= n ; i++)
		{
			 double c = p*Math.pow((1+r), i);
			 System.out.println("Compound Intrest of " +i +" : "+c);
		}
		
	}

}
