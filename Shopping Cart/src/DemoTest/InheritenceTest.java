package DemoTest;

import org.junit.jupiter.api.Test;

import Demo.Inheritence;

public class InheritenceTest extends Inheritence{
	
	int startHeight;
	
	public InheritenceTest(int gear, int speed,int startHeight) {
		
		super(gear, speed);
		this.startHeight = startHeight;
		
	}
	
	public void setstartHeight(int newValue) {
		
		startHeight = newValue;
	}
	public String toString() {
		
		return super.toString()+"\nheight of ride : "+startHeight;
	}


	@Test
	void test() {
	
		InheritenceTest IT = new InheritenceTest(3, 12, 30);
		System.out.println(IT.toString());
		
	}

}
