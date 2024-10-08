package oopsExamples;
import java.util.Scanner;

interface Methods //Interface 
{
	Scanner sc = new Scanner(System.in); //Object for Scanner Class
	static void vowelsCount() //
	{
		String s1;
		int vowelCount = 0;
		
		System.out.print("Enter any sentence: "); //Printing message to enter any Sentence
		s1=sc.nextLine().toLowerCase(); //Taking input from user and Converting into lower case.
		
		for (int index = 0 ;index<s1.length();index++)  //For loop for iterating and checking each char present in String
		{
			char character = s1.charAt(index); //Checking char at index
			if (character == 'a' || character == 'e' || character == 'i'
					|| character == 'o' || character == 'u'); //If condition for checking vowels present in user sentence
			{
				System.out.println(" ");
				vowelCount++; //Vowelcount Increment
			}
		}
		System.out.println("Total no of vowels present in sentence: " + vowelCount); //Printing Vowels count
	}
	
	static void consonantsCount()
	{
		System.out.println("Enter any sentence:");//Display Message
		String s1 = sc.nextLine().toLowerCase();  /*Taking string from user Through keyboard and
                                                   converting given Sentence to lower case*/
		System.out.println("Entered Sentence is: "+ s1);

		int consonants = 0; //Initially zero for increment
		System.out.println("Consonants present in the given sentence are: ");
		for (int index = 0; index < s1.length(); index++) /*For loop for checking and 
        	                                       traversing index wise each letter*/
		{
			char characters = s1.charAt(index); //Checking characters present at index
			// Check if the character is a consonant (not a vowel and is a letter)
			if (characters >= 'a' && characters <= 'z' && 
					characters != 'a' && characters != 'e' && 
					characters != 'i' && characters != 'o' && characters != 'u') 
			{
				System.out.println(characters + " "); //print the characters..
				consonants++; //Counting the consonants...
			}
		}     
		System.out.println("Total number of consonants: " + consonants);
	}
static void specialCharCount()
{
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
	System.out.println("Total number of Special characters are: " + specialCharCount);
}
}
public class InterFaceWithMethods 
{
	public static void main(String[] args) 
	{
		Methods.vowelsCount();
		Methods.consonantsCount();
		Methods.specialCharCount();
	}
}
