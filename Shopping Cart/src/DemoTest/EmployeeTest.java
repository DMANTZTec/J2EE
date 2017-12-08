package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Employee;
import Demo.Salary;

class EmployeeTest {

	@Test
	void test() {
		
		Employee e = new Salary(1, "pooja", "Machilipatnam, AP",25000);
		Salary s = new Salary(2, "Geetha", "Hyderabad, Telengana", 35000);
		
		System.out.println("mail checking using employee reference ");
		e.mailCheck();
		
		System.out.println();
		
		System.out.println("mail checking using salary reference ");
		s.mailCheck();
		
		s.ComputerPay();
	}

}
