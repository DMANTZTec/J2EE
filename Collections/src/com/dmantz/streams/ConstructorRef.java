package com.dmantz.streams;


class Sample{
	
	
	
	Sample(String s){
		
		System.out.println("Sample Class Constructor execute with arguments:"+s);
	}
	
}

interface Interfa{
	
	public Sample get(String s) ;
		
	}

public class ConstructorRef {
	public static  void main(String []args) {
		
	Interfa i=Sample::new;

	Sample s1=i.get("Santhosh Reddy");
	
	}

	

}
