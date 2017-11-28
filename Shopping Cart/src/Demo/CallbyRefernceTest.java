package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CallbyRefernceTest {
	
	int a,b;
	
	CallbyRefernceTest(int i,int j)
	{
		a = i;
		b = j;
	}

	@Test
	void test(CallbyRefernceTest c) {
		
		c.a *= 2;
		
		c.b /= 2;
		
	}

}
