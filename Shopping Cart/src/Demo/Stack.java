package Demo;

public class Stack {
		
		int stck[] = new int[10];
		int t;

		void test() {
		
			 t = -1;
			 
		}

		public void push(int i) {
			
			if(t == 9)
				System.out.println("Stack is full");
			else
				stck[++t] = i;
		}

		public int pop() {
			
			
			if(t<0)
			{
				System.out.println("stack is underflow");
				return 0;
			}
			else
				return stck[t--];
			
		}

}
