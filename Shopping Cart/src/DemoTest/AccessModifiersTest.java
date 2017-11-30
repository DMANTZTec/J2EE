package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.AccessModifiers;

class AccessModifiersTest {

	@Test
	void test() {
	
       AccessModifiers amt = new AccessModifiers();
		
		amt.A();
		amt.A1();
		amt.A2();
		amt.test();
	}

}
