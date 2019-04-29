package com.dmantz.streams;

import java.util.function.*;

/*Predicate:
	
	Predicate is the predefined functional interface 
	Predicate->Take Some input and perform some conditional check and returns boolean value.
	Predicate->test()
*/
public class PredicateFI {
	
	public static void main(String[]args) {
		
		String[] s= {"Chiranjeevi","Balayya","Venkatesh","Nag","Vijayashanti","Radha"};
		
		Predicate<String> p=s1->s1.length()%2==0;
		
		for(String s1:s) {
			
			if(p.test(s1)) {
				
				System.out.println(s1);
			}
		}
		
		/*BiPredicate<Integer,Integer> p =(a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));
		
		*/
		
	}

}
