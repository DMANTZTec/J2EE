package com.example.dmantz.controlstatements;

public class MarksList {
	public static void main(String args []){
		int maths = 95;
		int science = 80;
		int english = 75;
		int social = 90;
		int total = 340;
		
		if (total <300 && total >=320){
			System.out.println("b-grade & passed");
		}else if(total <320 && total >=340){
			System.out.println("A-grade and passed");
		}
	}

}
