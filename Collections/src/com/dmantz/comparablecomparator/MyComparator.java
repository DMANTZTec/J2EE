package com.dmantz.comparablecomparator;

import java.util.Comparator;


//Comparable->If we want default sorting order we can use comparable.	
//Comparator->By using comparator object we can define our own customized sorting


public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.compareTo(s2);//it's give the result in Ascending order
		//return s2.compareTo(s1);//it's give the result in descending order
		//return 1;//it's give the result in Insertion Order
		//return -1;//it's give the result in Reverse of Insertion Order
		//return 0;//it's give the result only first element All the remaining elements considered as duplicate objects
	}
	
	

}
