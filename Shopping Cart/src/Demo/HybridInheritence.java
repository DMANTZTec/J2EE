package Demo;

public class HybridInheritence implements B,C {

	public int methodA() {
		
		System.out.println("MethodA");
		return 0;
		
	}

	public int methodB() {
		
		System.out.println("MethodB");
		return 0;
		
	}

	public void methodC() {
		
		System.out.println("MethodC");
		
	}

}

interface A{
	
	 int methodA();
	
}

interface B extends A{
	
	int methodB();
	
}

interface C extends A{
	
	void methodC();
	
}
