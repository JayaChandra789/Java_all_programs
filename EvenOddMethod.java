package nenu;
import java.util.Scanner;//import scanner 

public class EvenOddMethod
{
	public static void even_or_odd(int a) //a= parameter
	{
		if (a%2==0) //checks even or odd and prints even
		{
			System.out.print(a +  " is Even ");
		}
		else //else it prints odd
		{
			System.out.print(a + " is Odd");
		}
	}    //done with method 
	public static void main (String[] args) //main method
	{
		Scanner sc = new Scanner(System.in);  //Scanner class sc
		System.out.println("Enter number to check Even or Odd: "); //display to enter numbers from user.
		int a = sc.nextInt(); //takes the input from the user.

		even_or_odd(a); //calling method in main method.
	}
}
