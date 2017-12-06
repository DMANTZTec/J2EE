package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Static;

class StaticTest {
	
	
	@Test
	 void test() {
		
		Static obj1 = new Static();
		Static obj2 = new Static();
		
		obj1.i = 88;
		obj1.j = 88;
		
		obj2.i = 99;
		obj2.j = 99;
		
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		assertEquals(99,obj1.i);
		assertEquals(88,obj1.j);
		assertEquals(99,obj2.i);
		assertEquals(99,obj2.j);
	}

}
