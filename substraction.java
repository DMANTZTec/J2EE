import java.util.Scanner;

class substraction {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("enter a number: ");
		x = input.nextDouble();
		System.out.println("please enter another number to substract: ");
		y = input.nextDouble();
		
		z = x/y;
		
		System.out.println("the result is:" + z);
		
	}

}
