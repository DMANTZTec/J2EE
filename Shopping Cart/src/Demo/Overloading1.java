package Demo;

public class Overloading1 {
	
	public static void main(String[] args) {
		
		OLTest m1 = new OLTest();
		OLTest m2 = new OLTest(3);
		OLTest m3 = new OLTest(4,5,6);
		OLTest m4 = new OLTest(4);
		
		System.out.println(m1.add());
		System.out.println(m2.add());
		System.out.println(m3.add());
		System.out.println(m4.add());
	}

}
