package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import Demo.CompoundIntrest;

class CompoundIntrestTest {

	@Test
	void test() {
		
		int p,n;
		float r;
		double c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the princple amount");
		p = s.nextInt();
		System.out.println("enter the rate of intrest");
		r = s.nextFloat();
		System.out.println("enter the period");
		n = s.nextInt();
		
		CompoundIntrest ci = new CompoundIntrest(p, n, r);
		
	
	}

}
