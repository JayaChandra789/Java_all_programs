package oopsExamples;
import java.util.Scanner;

public class StringsAreEqual
{
	public static void main(String[] args) 
	{
		// Create a scanner to read input from the user
		Scanner sc = new Scanner(System.in);

		// Declare string variables
		String s1, s2; 

		// Ask the user to input
		System.out.print("Enter sentence 1:");
		s1 = sc.nextLine();
		System.out.print("Enter sentence 2:");
		s2 = sc.nextLine();

		//checks equals or not
		if (s1.equals(s2)) 
		{
			System.out.println("Both strings are equal.");
		} 
		else 
		{
			System.out.println("Strings are not equal.");
		}
		sc.close();
	}
}
