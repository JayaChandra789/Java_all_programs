package oopsExamples;
import java.util.Scanner;

/*-------------------------------CUSTOM EXCEPTION--------------------------------------*/
class AgeException extends Exception
{
	public AgeException(String msg) /*Constructor msg*/
	{
		super(msg);
	}
}
/*--------------------------------CUSTOM EXCEPTION-------------------------------------*/

public class CustomException 
{
	public static void main(String[] args) 
	{   
		/*-----------------------------Try block-----------------------------*/
		try(Scanner sc = new Scanner(System.in)) //Try with Resource helps closing Scanner implicitly
		{
			System.out.print("Enter age in years: ");
			int age = sc.nextInt();

			if (age >= 18)
			{
				System.out.println("Eligible for vote.");
			}
			else if (age >= 0)
			{
				System.out.print("Not eligible for vote.");
			}
			else
			{
				throw new AgeException("Negative age is not allowed");
			}	
		}
		/*------------------------Maintain catch block outside try block-----------------------*/
		catch(AgeException obj)
		{
			System.out.println(obj);
		}
	}
}
