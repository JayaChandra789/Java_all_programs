package oopsExamples;
import java.util.Scanner;

// Custom Exception for invalid email format
class InvalidEmailFormatException extends Exception //Custom Exception 
{
	public InvalidEmailFormatException(String message) //Constructor of class
	{
		super(message); //super msg
	}
}
public class ExamQuestionTwo //Main class
{
	public static void validateEmail(String email) throws InvalidEmailFormatException 
	{  
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; 

		if (!email.matches(emailRegex)) //If condition not equals
		{
			throw new InvalidEmailFormatException("Invalid email format: " + email);
		}
	}

	public static void main(String[] args)  //Main method
	{
		Scanner sc = new Scanner(System.in); //Object for Scanner class
		System.out.print("Enter an email address to validate: "); //prints message to user to enter E-mail
		String email = sc.nextLine(); //Taking input

		try //Try block 
		{
			validateEmail(email);
			System.out.println("Email is valid: " + email);
		} 
		catch (InvalidEmailFormatException e) //Object for Custom Excpetion
		{
			System.out.println(e.getMessage()); //Getting message from object
		} 
		finally 
		{

		}
	}
}
