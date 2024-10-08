package oopsExamples;
import java.util.Scanner;

// Custom Exception for invalid email format
class InvalidEmailFormatException extends Exception 
{
	public InvalidEmailFormatException(String message) 
	{
		super(message);
	}
}
public class ExamQuestionTwo
{
	public static void validateEmail(String email) throws InvalidEmailFormatException 
	{  
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

		if (!email.matches(emailRegex)) 
		{
			throw new InvalidEmailFormatException("Invalid email format: " + email);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an email address to validate: ");
		String email = sc.nextLine();

		try 
		{
			validateEmail(email);
			System.out.println("Email is valid: " + email);
		} 
		catch (InvalidEmailFormatException e) 
		{

			System.out.println(e.getMessage());
		} 
		finally 
		{

		}
	}
}
