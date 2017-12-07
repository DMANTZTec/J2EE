package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.HybridInheritence;

class HybridInheritenceTest {

	@Test
	void test() {
		
		HybridInheritence hi = new HybridInheritence();
		hi.methodA();
		hi.methodB();
		hi.methodC();
		
		
		assertEquals(0,hi.methodB());
		assertEquals(0,hi.methodA());
		
	}

}
