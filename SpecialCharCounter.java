package oopsExamples;
import java.util.Scanner;

public class SpecialCharCounter //class
{
	public static void main(String[] args) 
	{       
		Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input

		String s1; // Declare String variable
		int specialCharCount = 0; // Declaring Counting variable initially Zero..

		System.out.println("Enter any Sentence: ");
		s1 = sc.nextLine();

		// Iterate through each character in the string
		for(int index = 0; index < s1.length(); index++) 
		{
			char character = s1.charAt(index);
			// Check if the character is '@'
			if (character == '@' || character == '$' ) 
			{
				specialCharCount++;  // Increment count if Special character is found
			}
		}
		// Print the total count of '@' characters
		System.out.println("Total number of characters are: " + specialCharCount);
		
		sc.close(); // Close the scanner
	}
}
