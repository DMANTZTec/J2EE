package com.dmantz.streams;

public class DefaultAndStaticMethod implements DefaultAndStaticInterface {

	@Override
	public void m1() {
		System.out.println("This is m1() method");
	}

	@Override
	public void m2() {
		System.out.println("This is m2() method");
		
	}
	
	public void m3() {
				
		System.out.println("Overridng Default method");
	}
	
	public static void main(String []args) {
		DefaultAndStaticMethod ds=new DefaultAndStaticMethod();
		ds.m3();
		DefaultAndStaticInterface.m4();
		
	}
	
	
	

}
