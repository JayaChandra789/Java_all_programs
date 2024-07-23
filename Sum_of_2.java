package nenu;
import java.util.Scanner;

public class Sum_of_2 //By user input
{
   public static void main(String []args) 
   {
	 Scanner user_input = new Scanner(System.in);
	 System.out.print("Enter num 1: ");
	 double a = user_input.nextDouble();
	 System.out.print("Enter num 2: ");
	 double b = user_input.nextDouble();
	 double sum = a + b; //
	 System.out.print("The sum of two numbers is: " + sum);
	 user_input.close();
   }
}
