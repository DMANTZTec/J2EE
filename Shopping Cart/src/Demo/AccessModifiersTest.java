package Demo;

import org.junit.jupiter.api.Test;

class AccessModifiersTest {

	@Test
	private void test() {
		
		System.out.println("private");
		
	}
	
	void A(){
		
		System.out.println("default");
		
	}
	
	public void A1() {
		
		System.out.println("public");
		
	}
	
	protected void A2() {
		
		System.out.println("protected");
		
	}
	
	public static void main(String[] args)
	{
		
		AccessModifiersTest amt = new AccessModifiersTest();
		
		amt.test();
	}

}
