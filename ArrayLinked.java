package com.example.javaInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {

	public static void main(String args[]){    
	     
		  List<String> al=new ArrayList<String>();  
		  al.add("Harsha");    
		  al.add("Vijay");    
		  al.add("Yashwanth");    
		  al.add("Sashi");    
		    
		  List<String> al2=new LinkedList<String>();   
		  al2.add("Sajana");    
		  al2.add("vandana");    
		  al2.add("sai priya");    
		  al2.add("kanchan");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
		 }    
	}

