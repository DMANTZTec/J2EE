package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.SetAndGet;

class SetAndGetTest {
	
	@Test
	void test() {

		SetAndGet sg1 = new SetAndGet();
		SetAndGet sg2 = new SetAndGet(5);
		SetAndGet sg3 = new SetAndGet(5,13);
		SetAndGet sg4 = new SetAndGet(5,13,45);
		
		System.out.printf("%s\n",sg1.test());
		System.out.printf("%s\n",sg2.test());
		System.out.printf("%s\n",sg3.test());
		System.out.printf("%s\n",sg4.test());
		
		assertEquals("00:00:00",sg1.test());
		assertEquals("05:00:00",sg2.test());
		assertEquals("05:13:00",sg3.test());
		assertEquals("05:13:45",sg4.test());
	}
}
