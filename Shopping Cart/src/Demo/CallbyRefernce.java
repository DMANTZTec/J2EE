package Demo;

public class CallbyRefernce {
	
public int a;
public int b;
	
	public CallbyRefernce(int i,int j)
	{
		a = i;
		b = j;
	}

	public void test(CallbyRefernce c) {
		
		c.a *= 2;
		
		c.b /= 2;
		
	}

}
