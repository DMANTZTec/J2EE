package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	int l,b,h;
	@Test
		int Volume() {
			
			return l*b*h;
	}
	
	void Dim(int l, int b, int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}

}

