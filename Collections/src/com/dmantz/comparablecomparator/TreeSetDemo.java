package com.dmantz.comparablecomparator;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[]args) {
		
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add("Santhu");
		ts.add("Prasi");
		ts.add("Naru");
		ts.add("Sai");
		ts.add("Ram");
		System.out.println(ts);
	}
	
	

}
