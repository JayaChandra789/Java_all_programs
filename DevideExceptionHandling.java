package oopsExamples;
import java.util.Scanner;
/*write a program to input two number and divide a number by another*/
public class DevideExceptionHandling 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);/*Scanner Class ---OBJECT---*/
		/*---Member variables---*/
		int num1,num2; 
		System.out.print("Enter number 1: "); /*---Message---*/
		num1 = sc.nextInt();
		System.out.print("Enter number 2: ");/*---Message---*/
		num2 = sc.nextInt();
		
		/*---Perform division---*/ 
		/*---Exception Handling---*/
		try
		{
		System.out.println("--------------------------------------------------");
		double result = num1 / num2;
		System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
		System.out.println("--------------------------------------------------");
		//if 3 stmnts are there and 2 had error then it wont execute 3rd stmnt so it goes to catch
		}
		catch(ArithmeticException Obj)//only execute when try is not working or got an exception
		{/*Exception is spelled correctly or any name should be correctly and support only specific names*/
			System.out.println("Error has been occured " + Obj);
		}/*Base class catch block should be present at bottom of remaining blocks*/
		/*------------------------------------------------------------------------------*/
		finally 
		{
			System.out.println("Finally block executes.");
		}
	}
}