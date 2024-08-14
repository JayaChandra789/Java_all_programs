package oopsExamples;

public class SimpleCalculatorWithoutInput 
{
	public static void main(String[] args) 
	{
		// Define the numbers to be used in the operations
		double num1 = 10.5;
		double num2 = 5.0;
		// Perform the calculations
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		// Display the results
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
		System.out.println("The quotient of " + num1 + " divided by " + num2 + " is: " + quotient);
	}
}

