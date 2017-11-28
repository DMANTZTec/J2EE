package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OLTest {
	
	int a,b,c;

	@Test
	void OLTest(OLTest o) {
		
		a = o.a;
		b = o.b;
		c = o.c;
		
	}
	
	OLTest(int l){
		
		a = b = c = l;
		
	}
	
	OLTest(){
		
		a = 1;
		b = 2;
		c = 3;
		
	}
	
	OLTest(int a,int b,int c){
		
		this.a = a;
		this.b = b;
		c = c;
	}
	
	int add() {
		
		return a+b+c;
		
	}

}
