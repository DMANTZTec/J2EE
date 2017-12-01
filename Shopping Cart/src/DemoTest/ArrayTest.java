package DemoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import Demo.Array;

public class ArrayTest {
	
	
	Scanner s = new Scanner(System.in);
	public int m,n,p,q,k;
	public int a[][] = new int[m][n];
	public int b[][] = new int[p][q];
	public int c[][];
	

	@Test
	void test() {
		
		System.out.print("m : ");
		m = s.nextInt();
		System.out.print("n : ");
		n = s.nextInt();
		System.out.print("p : ");
		p = s.nextInt();
		System.out.print("q : ");
		q = s.nextInt();
		
		System.out.println("enter arr");
		for(int i = 0 ; i < m ; i++)
			for(int j = 0 ; j < n ; j++)
				a[i][j] = s.nextInt();
				
		for(int i = 0 ; i < p ; i++)
			for(int j = 0 ; j < q ; j++)
				b[i][j] = s.nextInt();
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("1.addition\n2.subraction");
		System.out.print("k : ");
		k = s.nextInt();
		
		Array ar = new Array();
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}

}
