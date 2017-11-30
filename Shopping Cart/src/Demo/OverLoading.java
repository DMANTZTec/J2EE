package Demo;

public class OverLoading {
	
public void test() {
		
		System.out.println("No parameters");
		
	}
	
	public int test(int i,double j)
	{
		
		System.out.println(i);
		return i*i;
		
	}
	
	void test(int i, int j)
	{
		System.out.println(i+ " " +j);
	}
	
	public double test(int i)
	{
		
		System.out.println(i);
		return i;
		
	}

}
