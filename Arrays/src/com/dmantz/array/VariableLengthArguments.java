package com.dmantz.array;

public class VariableLengthArguments {
	
	
	public static void main(String []args) {
		
		System.out.println(average(24,23,47,75,86));
		
		
	}
	
	public static int average(int...numbers) {
		
		int total=0;
		
		for(int x:numbers)
			
			total+=x;
		
		return total/numbers.length;
		
		
		
	}

}
