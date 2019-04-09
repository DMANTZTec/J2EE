package com.dmantz.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDupRemove {
	
	public static void main(String []args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("1");
		al.add("2");
		al.add("2");
		al.add("3");		
		al.add("3");
		System.out.println(al);
		LinkedHashSet lh=new LinkedHashSet(al);//Set not allowed duplicate values
		System.out.println(lh);		
	}

}
