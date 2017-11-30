package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.CallbyRefernce;

class CallbyRefernceTest {

	@Test
	void test() {
		
		CallbyRefernce c = new CallbyRefernce(10, 20);
		
		System.out.println("before call by reference a and b :" +c.a+ " " +c.b);
		c.test(c);
		System.out.println("after call by reference a and b :" +c.a+ " " +c.b);
	}

}
