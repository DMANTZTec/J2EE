package com.dmantz.array;

public class ArrayTable {
	
	
	/*An array is a data structure that represents an index collection of fixed no of homogeneous data
	elements. The main advantage of arrays is we can represent a group of values with single name
	
	
	The main limitation of arrays is they are fixed in size.
    i.e once we constructed an array there is no chance of increasing or decreasing bases on our
    requirement hence with respect to memory arrays shows worst performance.
	*/
	
	
	public static void main (String []args) {
		System.out.println("Index \t Value");
		 int arr[]= {5,10,15,20,25};
		 
		 for(int count=0;count<arr.length;count++) {
			 
			 System.out.println(count + "\t" +arr[count]);
			 
		 }
		
	}

}
