package Demo;

public class Demo {
	
	public static void main(String[] args)
	{
				
				DemoTest b1 = new DemoTest();
				DemoTest b2 = new DemoTest();
				int v;
				
				b1.Dim(100,20, 300);
				
				b2.Dim(120, 30, 30);

				System.out.print("Volume is ");
				v = b1.Volume();
				System.out.println(v);
				
				System.out.print("Volume is ");
				v = b2.Volume();
				System.out.println(v);
	}
		
		
}
