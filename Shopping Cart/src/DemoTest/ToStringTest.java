package DemoTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Demo.ToString;

class ToStringTest {
	
	static final int i;
	
	static {i = 20;}
	
	void run() {
		System.out.println("not final");
	}

	@Test
	void test() {
		
		final int i = 90;
		
		ToString ts1 = new ToString("pooja",1);
		ToString ts2 = new ToString("geetha",2);
		
		System.out.println(ts1);
		System.out.println(ts2);
		System.out.println(ToStringTest.i);
		System.out.println(i);
		
		assertEquals(90,i);
		assertEquals(20,ToStringTest.i);
		
	}

}
