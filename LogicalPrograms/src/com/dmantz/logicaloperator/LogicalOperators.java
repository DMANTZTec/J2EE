package com.dmantz.logicaloperator;

public class LogicalOperators {
	
	public static void main (String [] args) {
		
		int boy=21;
		int girl=18;
		
		  //if (boy>20 || girl>20) { //Even  one condition satisfied also if block  is executed 
		  if ((boy>20 && girl>16) && (boy>22 || girl>20)) { //should be satisfied both conditions then only if block is executed otherwise else block executed
		  	System.out.println("Yes they can marry");
		}else {
			System.out.println("They are not elgible to marry together");
		}
	}
	

}
