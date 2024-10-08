package oopsExamples;
import java.util.Scanner;
public class ExamQuestion 
{
/*Reverse the string.Convert the string to uppercase.
 * Count the number of vowels in the string. Display the results to the user.*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int vowelCount =0;
		
		System.out.println("Enter any text: ");
		String text =sc.nextLine().toUpperCase();
		System.out.println("Converted Upper case is: " + text);
		
		
		String reversed = new StringBuilder(text).reverse().toString();
		System.out.println("Reversed String is: "+ reversed);
		
		for(int index = 0 ;index<text.length();index++)
		{
			char ch = text.charAt(index);
			if (ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='U' )
			{
				vowelCount++;
			}	
		}	
		System.out.println("No of vowels present in given Text: " + vowelCount);
	}

private static String stringReverse(String text) {
	// TODO Auto-generated method stub
	return null;
}
}
