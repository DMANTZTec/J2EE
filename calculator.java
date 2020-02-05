import java.util.Scanner;

class calculator {
  public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  double x;
	  double y;
	  double z;
	  
	  System.out.println("please enter a number: ");
	  x = input.nextDouble();
	  System.out.println("please enter a number for addition: ");
	  y = input.nextDouble();
	  
	  z = x+y;
	  
	  System.out.println("your answer is: " +z);
		

	}

}
