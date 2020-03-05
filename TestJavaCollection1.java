package com.example.javaInterface;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestJavaCollection1 {

	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");    
		
		System.out.println(list.get(1));
		}  
}
