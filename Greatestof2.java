package nenu;
import java.util.Scanner;

public class Greatestof2 
{

	public static void main(String[] args) 
	{
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int a = user_input.nextInt();
		System.out.print("Enter Num2: ");
		int b = user_input.nextInt();
		
		if (a>b)  
		{
			System.out.print("A is greater: " + a);
		}
		else 
		{
			if (b>a) 
			{
				System.out.println("B is greater: " + b);
			}
		System.out.print("Both are equal");
		}
	}
}
