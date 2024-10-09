package oopsExamples;
import java.util.Scanner;

class SimpleInterestException extends Exception 
{
	// Constructor
	SimpleInterestException(String msg) 
	{
		super(msg);
	}
}
public class ExceptionHandleSimpleIntrest 
{

	// Method to calculate simple interest
	public static double calculateSimpleInterest(double principal, double rate, double time) throws SimpleInterestException 
	{
		// Throw exception if any input is invalid 
		if (principal <= 0) 
		{
			throw new SimpleInterestException("Principal amount must be greater than zero.");
		}
		if (rate <= 0) 
		{
			throw new SimpleInterestException("Rate of interest must be greater than zero.");
		}
		if (time <= 0) 
		{
			throw new SimpleInterestException("Time period must be greater than zero.");
		}
		// Formula for calculating simple interest
		return (principal * rate * time) / 100;
	}

	public static void main(String[] args) 
	{
		try(Scanner scanner = new Scanner(System.in))
		{
			// Take input for principal, rate, and time from the user
			System.out.println("Enter the Principal amount: ");
			double principal = scanner.nextDouble();

			System.out.println("Enter the Rate of interest: ");
			double rate = scanner.nextDouble();

			System.out.println("Enter the Time period (in years): ");
			double time = scanner.nextDouble();

			// Call the method to calculate simple interest
			double interest = calculateSimpleInterest(principal, rate, time);

			// Display results
			System.out.println("The Principal amount: " + principal);
			System.out.println("The Rate of interest: " + rate + "%");
			System.out.println("The Time period: " + time + " years");
			System.out.println("The Simple Interest: " + interest);
		} 
		catch (SimpleInterestException e) 
		{
			//
			System.out.println("Error occurred: " + e);
		} 
		finally 
		{

		}
	}
}
