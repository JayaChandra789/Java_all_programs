package oopsExamples;
import java.util.Scanner;

public class AllStringHandleMethods 
{
	public static void main(String[] args) 
	{
		/*
		length() – Returns the length of the string.
		isEmpty() – Checks if the string is empty ("").
		
		equals(Object another) – Compares two strings for equality.
        equalsIgnoreCase(String another) – Compares two strings ignoring case.
		compareTo(String another) – Compares two strings lexicographically.
		
		concat(String str) – Concatenates the specified string to the end of this string.
		replace(char oldChar, char newChar) - Replace old with new string.
		
		toUpperCase() – Converts all characters in the string to uppercase.
		toLowerCase() – Converts all characters in the string to lowercase.
		
		toCharArray() – Converts the string to a new character array.
		charAt(int index) – Returns the character at the specified index.
		
		split() - Splits the string with spaces.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Sentence: ");
		String s1,s2;
		s1 = sc.nextLine();
		System.out.print("Enter any Sentence: ");
		s2 = sc.nextLine();
		//All methods
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals(s2));
		if (s1.equalsIgnoreCase("5"))
				{
			System.out.println("yes equals");
				}
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(s2));
	//	replace(char s1, char s2); 
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		for(int len = 0;len<s1.length();len++) 
		{
			char characters  = s1.charAt(len); //Or result variable
			System.out.println(" ' "+characters +" ' ");
			//use any conditions here
		} 	
	}

}
