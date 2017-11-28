package Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {
	
	int stck[] = new int[10];
	int t;

	@Test
	void test() {
	
		 t = -1;
		 
	}


	void push(int i) {
		
		if(t == 9)
			System.out.println("Stack is full");
		else
			stck[++t] = i;
	}

	int pop() {
		
		
		if(t<0)
		{
			System.out.println("stack is underflow");
			return 0;
		}
		else
			return stck[t--];
		
	}

}
