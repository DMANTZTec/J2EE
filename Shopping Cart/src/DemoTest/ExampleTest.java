package DemoTest;

import org.junit.jupiter.api.Test;

import Demo.Example;

import java.util.Scanner;

class ExampleTest {

	@Test
	void test() {
		
		Scanner S = new Scanner(System.in);
		
		Example e = new Example("pooja");
		String a = e.print();
		
		System.out.print("enter the name : ");
		String name = S.nextLine();
		e.SetName(name);
		String b = e.print();
		
		if(a==b)
			System.out.print(a+" " +b+" match" );
		else
			System.out.println(a+" " +b+" don't match" );
		
		if(a.equals(b))
			System.out.print(a+" " +b+" match" );
		else
			System.out.println(a+" " +b+" don't match" );
		
		System.out.println(a.equals(b)?a+" " +b+" match":a+" " +b+" don't match");
	}

}
