package Demo;

public class Final {
	
	private int sum;
	private final int num;
	
	public Final(int x)
	{
		num = x;
	}
	
	public void add() 
	{
		sum += num;
	}
	
	public String toString()
	{
		return "sum = "+sum+"\n";
	}

}
