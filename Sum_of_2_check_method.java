package nenu;
import java.util.Scanner;

public class Sum_of_2_check_method 
{
	public static int sum(int a,int b)
	{
		int sum1 = a + b;
		return sum1; //Here it is returning whole method in sum1 variable
	}
	public static void main(String[] args) //Main method
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();

		int positive = sum( a, b);//storing method in positive variable to check positive or not.
		if (positive > 0) 
		{		  
			System.out.print(positive + " is Positive: " );
		}
		else if (positive == 0) 
		{
			System.out.print(positive + " is not Postive and Negative: " ); //to print zero 
		}
		else 
		{		  
			System.out.print(positive +" is Negative: ");
		}	  
	}
}
