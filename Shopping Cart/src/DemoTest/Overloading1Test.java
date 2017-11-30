package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Overloading1;

public class Overloading1Test {

	@Test
	void test() {
		
		Overloading1 m1 = new Overloading1();
		Overloading1 m2 = new Overloading1();
		Overloading1 m3 = new Overloading1(4,5,6);
		Overloading1 m4 = new Overloading1(4);
		
		System.out.println(m1.add());
		System.out.println(m2.add());
		System.out.println(m3.add());
		System.out.println(m4.add());
		
	}

}
