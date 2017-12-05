package DemoTest;

import Demo.Enum;
import java.util.EnumSet;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnumTest {

	@Test
	void test() {
		
		for(Enum Months : Enum.values())
			System.out.printf("%s\t %s\n",Months, Months.getDays());
		
		System.out.println("\nSet of Range\n");
		for(Enum Months : EnumSet.range(Enum.May,Enum.July))
			System.out.printf("%s\t%s\n",Months, Months.getDays());
	
	}

}
