package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Demo.Final;

class FinalTest {

	@Test
	void test() {
		
		Final f = new Final(10);
		
		for(int i = 0 ; i < 5 ; i++)
		{
			f.add();
			System.out.print(f);
			
		}
		
	}

}
