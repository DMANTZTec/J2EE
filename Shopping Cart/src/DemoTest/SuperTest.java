package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Emp;
import Demo.Person;

class SuperTest {

	@Test
	void test() {
		
		Emp e1=new Emp(1,"pooja",45000f);  
		e1.display();
	
	}

}

