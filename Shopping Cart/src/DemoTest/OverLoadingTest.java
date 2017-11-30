package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.OverLoading;

class OverLoadingTest {

	@Test
	void test() {
		
		OverLoading o = new OverLoading();
		
		o.test();
		o.test(10);
		o.test(10,20);
		o.test(10);
		int i = 30;
		o.test(i);
	}

}
