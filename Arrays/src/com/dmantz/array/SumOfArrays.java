package com.dmantz.array;

public class SumOfArrays {
	
	public static void main(String []args) {
		
		int arr[]= {111,222,333,444,555};
		int sum=0;
		
		for(int count=0;count<arr.length;count++){
			
			sum+=arr[count];	
			
		}		
		
		System.out.println("The Sum Of These Total Numbers are "+sum);
		
		/*
		for(int x: arr) {
			
			sum+=x;
		}
		
		System.out.println(arr);*/
		
	}

}
