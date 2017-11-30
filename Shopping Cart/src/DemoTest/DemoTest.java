package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Demo;

class DemoTest {

	@Test
	void test() {
		
		Demo b1 = new Demo();
		Demo b2 = new Demo();
		int v;
		
		b1.Dim(1,2,3);
		b2.Dim(120, 30, 30);

		System.out.print("Volume is ");
		v = b1.Volume();
		System.out.println(v);
		
		System.out.print("Volume is ");
		v = b2.Volume();
		System.out.println(v);

	}

}
