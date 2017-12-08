package Demo;

public class Employee {
	
	int EmployeeNumber;
	String EmployeeName;
	String EmployeeAddress;
	
	public Employee(int EmployeeNumber, String EmployeeName, String EmployeeAddress)
	{
		this.EmployeeNumber = EmployeeNumber;
		this.EmployeeName = EmployeeName;
		this.EmployeeAddress = EmployeeAddress;
	}
	
	public String toString() {
		
		return "Employee Number : "+EmployeeNumber+"\nEmployee Name : "+EmployeeName+"\n Employee Address : "+EmployeeAddress;
	
	}
	
	public int getEmployeeNumber() {
		
		return EmployeeNumber;
	}
	
	public String getEmployeeName() {
		
		return EmployeeName;
	}

	public String getEmployeeAddress() {
	
		return EmployeeAddress;
	}
	
	public void setEmployeeAddress(String Address) {
		
		EmployeeAddress = Address;
	}
	
	public void mailCheck() {
		
		System.out.println("mailing a check to "+this.EmployeeName+" "+this.EmployeeAddress);
	}
	
}
