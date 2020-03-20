package com.example.dmantz.controlstatements;

public class NestedExample {
	public static void main(String[] args) {      
	        
	    int age=25;    
	    int weight=75;      
	        
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible for blood donation");    
	        } else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    }  
	}  }


