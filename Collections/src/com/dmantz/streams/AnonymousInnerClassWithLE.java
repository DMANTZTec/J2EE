package com.dmantz.streams;

/*AnonymousInnerClass != LamdaExpressions

If AnonymousInnerClass implements an interface that contains single abstract method then only we can replace 
that AnonymousInnerClass With LamdaExpressions.
*/
public class AnonymousInnerClassWithLE {
	
	public static void main(String args[]) {
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				
				System.out.println("Child Thread");
			}			
		};
		
		Thread t=new Thread(r);
		
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
		}	
		
	}
	}
	
	//OR We can implement through Method Reference also
	
	/*public static void m1() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child Thread");
		}
	}
		
		public static void main(String args[]) {
			
			Runnable r=AnonymousInnerClassWithLE::m1;
			
			
			Thread t=new Thread(r);
			
			t.start();
			for(int i=0;i<10;i++) {
				System.out.println("Main Thread");
				
			}	
		}
	}*/
	
	
	
	
	
	
	
	
	


