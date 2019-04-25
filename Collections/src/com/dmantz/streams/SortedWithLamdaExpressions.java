package com.dmantz.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Lamda Expressions and Functional Interface:
============================================
-> The main Objective of LamdaExpressions is to enable functional programming in java.
->With LamdaExpressions we can write very concise code so that redability of the application will be improved.
->Functional Interface reference can be used to hold LamdaExpressions.
->Functional Interface should contain only one abstract method.
->Only for functional interfaces we can write lamda expression implemention.
*/
public class SortedWithLamdaExpressions {
	
	public static void main (String[]args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sachin Tendulkar");
		al.add("Virendra Sewhag");
		al.add("Gowtam Gambir");
		al.add("Yuvaraj Singh");
		al.add("Mahendra Sing Dhoni");
		al.add("Kapil Dev");
		
		System.out.println(al);
		Comparator<String> c=
			(s1,s2)->{
				int l1=s1.length();
				int l2=s2.length();			
				if (l1<l2) return 1;
				else if (l1>l2) return -1;
				else return s1.compareTo(s2);
	
			};
			
			List<String> sortedList=al.stream().sorted(c).collect(Collectors.toList());
			
			System.out.println(sortedList);
		
		
		
	}

}
