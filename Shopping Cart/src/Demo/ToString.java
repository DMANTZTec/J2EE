package Demo;

public class ToString {
	
	String name;
	int no;
	
	public final void run() {
		System.out.println("final");
	}
	
	public ToString(String name, int no)
	{
		this.name = name;
		this.no = no;
	}
	
	public String toString() 
	{
		return name+" "+no;
	
	}

}
