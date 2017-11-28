package Demo;

public class OverLoading {
	
	public static void main(String[] args) {
		
		OverLoadingTest o = new OverLoadingTest();
		
		o.test();
		o.test(10);
		o.test(10,20);
		o.test(10);
		int i = 30;
		o.test(i);
	}
	
	

}
