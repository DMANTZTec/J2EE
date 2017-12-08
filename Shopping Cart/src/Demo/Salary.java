package Demo;

public class Salary extends Employee {
	
	private float EmployeeSalary;

	public Salary(int EmployeeNumber, String EmployeeName, String EmployeeAddress, float EmployeeSalary) {
		
		super(EmployeeNumber, EmployeeName, EmployeeAddress);
		setEmployeeSalary(EmployeeSalary);
		
	}

	private void setEmployeeSalary(float Salary) {
		
		EmployeeSalary = Salary;
		
	}
	
	float getEmployeeSalary() {
		
		return EmployeeSalary;
		
	}
	
	public float ComputerPay() {
		
		System.out.println("Computing salary pay for" +getEmployeeName());
		return EmployeeSalary/52;
	}
	
	public void mailCheck() {
		
		System.out.println("Within mailcheck of Salary class : \n mail checking to "+getEmployeeName()+" with Salary "+getEmployeeSalary());
	}

}
