package oopsExamples;
import java.util.Scanner;
public class ExamQuestion //Main class
{
/*Reverse the string.Convert the string to uppercase.
 * Count the number of vowels in the string. Display the results to the user.*/
	public static void main(String[] args) //Main Method 
	{
		Scanner sc = new Scanner(System.in); //object for Scanner Class
		int vowelCount = 0; //Initially Vowel count Zero
		
		System.out.println("Enter any text: ");  //Message to user 
		String text =sc.nextLine().toUpperCase(); //Taking input from user and converting into lower case using method directly
		System.out.println("Converted Upper case is: " + text); 
		
		
		String reversed = new StringBuilder(text).reverse().toString(); //Reverse method to ocnvert given text to reverse
		System.out.println("Reversed String is: "+ reversed); //Dispaly Reversed string
		
		for(int index = 0 ;index<text.length();index++) //For loop
		{
			char ch = text.charAt(index);
			if (ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='U' ) //Condition for checking vowels
			{
				vowelCount++; //Vowels Count Increament 
			}	
		}	
		System.out.println("No of vowels present in given Text: " + vowelCount); //Display Vowel Count 
	}

private static String stringReverse(String text) 
	{
	// TODO Auto-generated method stub
	return null;
	}
}
