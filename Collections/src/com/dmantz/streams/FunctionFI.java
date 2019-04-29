package com.dmantz.streams;

/*Function:
	
	Function is the predefined interface ,
	Function->Take Some input and perform some operation and returns the result,
	which is need not to be boolean type.
	
	Function->apply()
	
*/
import java.util.function.Function;

public class FunctionFI {
	
	public static void main(String [] args) {
		
		Function<String,Integer> f=s->s.length();
		
		System.out.println(f.apply("santhosh reddy"));
		
	}

}
