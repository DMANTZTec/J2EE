package Demo;

import DemoTest.ArrayTest;

public class Array {
	
	public Array() {
		
		ArrayTest at = new ArrayTest();
		
			switch(at.k)
			{
			case 1 : if(at.m == at.p && at.n == at.q)
						{
							for(int i = 0 ; i < at.m ; i++)
								for(int j = 0 ; j < at.n ; j++)
									at.c[i][j] = at.a[i][j] + at.b[i][j];
						}
					 else 
						System.out.println("order doesn't match");
			case 2 : if(at.m == at.p && at.n == at.q)
						{
							for(int i = 0 ; i < at.m ; i++)
								for(int j = 0 ; j < at.n ; j++)
									at.c[i][j] = at.a[i][j] - at.b[i][j];
						}
					 else 
						System.out.println("order doesn't match");
			}

}
}
