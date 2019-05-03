package com.dmantz.streams;


interface Inter{
	
	public void add(int a,int b);
}

 class MethodRef {
	
	public static void sum(int x,int y) {
		
		System.out.println("The Sum:"+(x+y));
				
	}
	
	public static void main(String []args) {
		
		Inter i=(a,b)->System.out.println("The Sum:"+(a+b));
		
		i.add(10, 20);
		
		Inter i1=MethodRef::sum;
		i1.add(100, 200);
	}
	
	
	

}
