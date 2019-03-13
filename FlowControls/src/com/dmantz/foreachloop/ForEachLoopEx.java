package com.dmantz.foreachloop;

public class ForEachLoopEx {
	
	/*The most convenient loop for accessing the elements of only arrays & collections 
	 * but the limitation of this loop is applicable for arrays & collections and it is not general loop.
	 *  this loop has introduced in 1.5 version
	*/
	
	public static void main(String[] args) {
		
		int []a= {10,20,30};
		for(int x:a) {
			System.out.println(x);
			
		}
	}	
}
