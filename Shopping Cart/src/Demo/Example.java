package Demo;

public class Example {
	
	private String name;
	
	public Example(String name)
	{
		this.name = name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public String GetName()
	{
		return name;
		
	}
	
	public String print()
	{
		System.out.println("Name : "+GetName());
		return GetName();
	}

}
