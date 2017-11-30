package DemoTest;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

class AverageTest {
	
	int average,total,marks;
	Scanner s = new Scanner(System.in);

	@Test
	void test() {
		
		int c = 0;
		while(c < 10) 
		{
			marks = s.nextInt();
			total += marks;
			c++;
		}
		
		average = total/10;
		System.out.println("Average : "+average);
	}

}
