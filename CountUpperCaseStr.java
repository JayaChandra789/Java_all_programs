package oopsExamples;
import java.util.Scanner;

public class CountUpperCaseStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");

		String s1;
		s1 = sc.nextLine();
		int upperCount = 0;
		int lowerCount = 0;

		for (int index = 0;index <s1.length();index++) /*Here the index is used to traverse each element
		                                               in order to check ever caps or small letter*/
		{/*After Traversing, Below conditions checks Caps and Small by using for loop by Char method*/
			char character = s1.charAt(index);  /*here '''charAt''' is the method(),
			 '''char''' DATA TYPE,character at index =charAt */ 
			if (character >= 'A' && character <='Z') //It is mandatory range used for string 'A' & 'Z'
			{/*if Hello is given checks index i.e, 5 and ''charAt'' at index, Hello at index
			 ,checks hello at 'A-Z and a-z and increment upper and lower' */
				upperCount++;
			}
			if (character >= 'a' && character <='z') //It is mandatory range used for string 'a' & 'z'
			{
				lowerCount++;
			}
		}
		System.out.println("Upper cases are: " +upperCount);
		System.out.print("Lower cases are: " +lowerCount);
	}
	
	
	/*
	second appraoch
	for(int len = 0;len<sentence.length();len++)
	{
	 char characters = sentence.chatAt(len);
	 if (Character.isUpperCase(characters))
	 '''Character.isUpperCase()''' Is a method for checking upperCases
	        {
	           upper++
	        }
	 else if (Character.isLowerCase(characters)) 
			{
				lowerCount++;
			}
	}
	
	*/
}
