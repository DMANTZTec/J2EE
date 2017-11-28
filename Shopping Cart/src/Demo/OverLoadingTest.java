package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OverLoadingTest {

	@Test
	void test() {
		
		System.out.println("No parameters");
		
	}
	
	int test(int i,double j)
	{
		
		System.out.println(i);
		return i*i;
		
	}
	
	void test(int i, int j)
	{
		System.out.println(i+ " " +j);
	}
	
	double test(int i)
	{
		
		System.out.println(i);
		return i;
		
	}

}
