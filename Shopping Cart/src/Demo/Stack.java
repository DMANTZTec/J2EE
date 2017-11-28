package Demo;

public class Stack {
	
	public static void main(String[] args)
	{
		
		StackTest s1 = new StackTest();
		StackTest s2 = new StackTest();
		
		for(int i =0 ; i < 10 ; i++)
			s1.push(i);
		
		for(int i =10 ; i < 20 ; i++)
			s2.push(i);
		
		System.out.println("stack in s1 " );
		for(int i =0 ; i < 10 ; i++)
			System.out.println(s1.pop());
		
		System.out.println("Stack in s2");
			for(int i =0 ; i < 10 ; i++)
				System.out.println(s2.pop());
			
	}

}
