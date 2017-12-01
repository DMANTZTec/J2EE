package Demo;

import DemoTest.TimeTest;

public class Time {
	
	public static void main(String[] args) {
		
		TimeTest tt = new TimeTest();
				
		System.out.println(tt.test());
		tt.setTime(2,30,22);
		System.out.println(tt.toString());
	
	}

}
