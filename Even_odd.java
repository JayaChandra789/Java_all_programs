package newproject;
import java.util.Scanner;

public class Even_odd 
{

	    public static void main(String []args)
	    {
	        Scanner user = new Scanner(System.in); // System input
	         System.out.print("Enter Number to check Even or Odd: ");
	         int number = user.nextInt();
	         
	        if (number % 2 == 0)
	        {
	          System.out.print("Given number is Even: " + number);  
	        }
	        else
	        {
	           System.out.print("Given number is Odd: " + number); 
	        }
	    }
}


