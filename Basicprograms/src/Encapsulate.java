
 class Encapsulation {
	private String Ename;
	private int Eage;
	public String getName()
	{
		return Ename;
	}
	public int getAge()
	{
		return Eage;
	}
	public void setName(String n) 
	{
		Ename=n;
	}
	public void setAge(int a)
	{
		Eage=a;
	}
}
public class Encapsulate
{
public static void main(String[] args)
{
	Encapsulation e = new Encapsulation();
	e.setName("aaa");
	e.setAge(16);
	System.out.println(e.getName());
	System.out.println(e.getAge());
}
}
	


