package Demo;

public class CallbyRefernce {
	
	public static void main(String[] args)
	{
		
		CallbyRefernceTest c = new CallbyRefernceTest(10, 20);
		
		System.out.println("before call by reference a and b :" +c.a+ " " +c.b);
		c.test(c);
		System.out.println("after call by reference a and b :" +c.a+ " " +c.b);
		
	}

}
