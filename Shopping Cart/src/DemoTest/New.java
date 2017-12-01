package DemoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class New {

	@Test
	void test() {
		
		Random r = new Random();
		int f[] = new int[7];
		
		for(int i = 1 ; i < 1000 ; i++)
			++f[1+r.nextInt(6)];
		
		for(int i = 1 ; i < f.length ; i++)
			System.out.println(i + " " +f[i]);
		
		
		int t = 0;
		for(int i : f)
			t += i;
		System.out.println(t);
		assertEquals(999,t);
	}

}
