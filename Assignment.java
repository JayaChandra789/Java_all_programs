package nenu;
import java.util.Scanner;

public class Assignment 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int number2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Select operation: ");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		
		System.out.print("Enter operation: ");
		String input1=sc.nextLine();				
		
		if (input1 == "add") 
		{
			System.out.print(number1 + number2);
		}
		else if(input1 == "sub") 
		{
			System.out.print(number1 - number2);
		}
		else if(input1 == "mul") 
		{
			System.out.print(number1 * number2);
		}
		else if (input1 == "div") 
		 { 
			if(number2 == 0) 
		 {
			System.out.print("Division error");
		 }
			System.out.print(number1 % number2);
		 }
				
	}

}
