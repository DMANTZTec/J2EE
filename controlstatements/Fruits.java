package com.example.dmantz.controlstatements;

public class Fruits {
	public static void main(String args []){
		int apple = 50;
		int mango = 50;
		int banana = 50;
		
		if(apple>mango){
			System.out.println("apples are costly than banana");
		}else if(mango>banana){
			System.out.println("mangoes are costly than banana");
		}else if(mango == apple && mango == banana && apple == banana){
			System.out.println("all are equal");
		}else{
			System.out.println("undifined");
		}
	}

}
