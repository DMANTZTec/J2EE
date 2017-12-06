package Demo;

public class Emp extends Super{
	
	float salary;  
	
	public Emp(int id,String name,float salary){  
		
		super(id,name);
		this.salary=salary;  
		
	}  
	
	public void display(){
		
		System.out.println(id+" "+name+" "+salary);
		
	}  
}
