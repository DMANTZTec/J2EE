import java.util.Scanner;

class multiplication {
   public static void main(String[] args) {
	 
	   Scanner input = new Scanner(System.in);
	   
	   double x;
	   double y;
	   double z;
	   
	   System.out.println("please enter a number: ");
	   x = input.nextDouble();
	   System.out.println("enter a number to multiply: ");
	   y = input.nextDouble();
	   
	   z = x*y;
	   
	   System.out.println("result is: " + z );
     }

}
