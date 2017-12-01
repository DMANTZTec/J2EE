package DemoTest;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomTest {

	@Test
	void test() {
		 
		Random r = new Random();
		int otp = 0;
		int o[] = new int[4] ;
		
		for(int i = 0 ; i < 4 ; i++)
		{
			otp = r.nextInt(9);
			o[i] = otp;
		}
		
		System.out.print("OTP : " );
		for(int i = 0 ; i < 4 ; i++)
		System.out.print(o[i]);
	}

}
