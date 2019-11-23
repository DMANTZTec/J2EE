package com.dmantz.streams;


interface Inter{
	
	public void add(int a,int b);
	
}

 class MethodRef {
	
	public static void sum(int x,int y) {
		
		System.out.println("The Sum:"+(x+y));
				
	}
	
	MethodRef(int a,int b){
		
		System.out.println("This is Constructor adding "+(a+b));
	
	}
		
	public static void main(String []args) {
		
		Inter i=(a,b)->System.out.println("The Sum:"+(a+b));
		
		
		i.add(10, 20);
		
		Inter i1=MethodRef::sum;
		Inter i2=MethodRef::new;
		i1.add(100, 200);
		i2.add(20,30);

	}
	
}
