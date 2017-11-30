package Demo;

import org.junit.jupiter.api.Test;
import DemoTest.Overloading1Test;

public class Overloading1 {
	
	int a,b,c;

	void Overloading1(Overloading1 o) {
		
		a = o.a;
		b = o.b;
		c = o.c;
		
	}
	
	public Overloading1(int l){
		
		a = b = c = l;
		
	}
	
	public Overloading1(){
		
		a = 1;
		b = 2;
		c = 3;
		
	}
	
	public Overloading1(int a,int b,int c){
		
		this.a = a;
		this.b = b;
		c = c;
	}
	
	public int add() {
		
		return a+b+c;
		
	}
	
}
