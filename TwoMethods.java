package nenu;
import java.util.Scanner;

public class TwoMethods 
{
	public static void even(int a ) 
	{
		if (a%2==0)
		{
			System.out.print("Entered number " + a +  " is Even: ");
		}
		else 
		{
			System.out.print("Entered number " +  a + " is Odd:");
		}
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Even or Odd: ");
		int a = sc.nextInt();

		even(a);
	}
}
