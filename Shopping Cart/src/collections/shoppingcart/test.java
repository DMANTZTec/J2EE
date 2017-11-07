package collections.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		
		Order JUnit = new Order();
		int r = JUnit.add(2,3);
		assertEquals(5,r);
	
	}

}
