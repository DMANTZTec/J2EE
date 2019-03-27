package com.dmantz.stringlogicalprograms;

public class StringLength {
	
	/*Once we created String objects we are not allowed to perform any changes in the existing object. If u r
	trying to perform any changes with those changes a new String object will be created this behavior is
	nothing but ‘immutability’ Of the String Object.
	
	Once we created a StringBuffer object we are allowed perform any changes in the existing object only. This
	behavior is nothing but ‘mutability’ of the StringBuffer object.
	*/
	
	public static void main(String []args) {
		
		String s=new String("Dmantz");
		int i=s.length();
		System.out.println(i);
	}

}
