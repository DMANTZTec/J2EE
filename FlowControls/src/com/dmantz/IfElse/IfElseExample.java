package com.dmantz.IfElse;

public class IfElseExample {
	
	/*
	IfElse - When:If we want to execute a certain section of code based upon whether the specified condition is true or false
	then we go for IfElse
	
	IfElseIf - it's possible to execute one block of code among many. For that, you can use if..else...if statement.
	
	
	- In the case of if-else statements else part & curly braces are optional.
	- Without curly braces we are allowed to take 1 statement under ‘if’, that statement never be
	-declarative statement other wise compile time error.*/
	
	public static void main(String []args) {
		
		int crickeplayers=11;
	
		if(crickeplayers<=10) {
			System.out.println("yes we have one team and ready to play");			
			}else{
			System.out.println("we dont have players so we aren't play");
			if(crickeplayers==11) 
			{	
				System.out.println("Now we have players so we r ready to play");
			} else {
		       System.out.println("Ok");
	}
			
	}
}
	
}