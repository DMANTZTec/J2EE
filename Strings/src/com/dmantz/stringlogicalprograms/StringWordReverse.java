package com.dmantz.stringlogicalprograms;

public class StringWordReverse {
	
	public static void main(String []args) {
		
		String str="Dmantz";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
		/*String str="Hellow Iam in Damantz";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			String data=s[i];
			for(int j=data.length()-1;j>=0;j--) {
				
				System.out.print(data.charAt(j));
				
			}
			
			System.out.print("");
		}*/
	}

}
