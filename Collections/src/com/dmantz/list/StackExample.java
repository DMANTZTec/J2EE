package com.dmantz.list;

import java.util.Stack;

//It is the child class of Vector contains only one constructor

public class StackExample {
	
	public static void main(String[] args) {	
		
		Stack<String> s=new Stack<String>();
		s.push("santhu");
		s.push("ss");
		s.push("reddy");
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
	

}
