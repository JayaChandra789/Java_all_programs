package nenu;

import java.util.Scanner;

public class ArrayStudentMArks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		int len ;
		int high = 0;
		int marks[] = new int[3]; // Creating New array to store		
		System.out.println("Enter marks to print in list "); 
		
		for(len = 0;len < marks.length; len++) 
		{
			System.out.print("Enter marks: ");
			marks[len] = sc.nextInt();  //input from user stores in array until length match			
		}		
		System.out.print("Entered marks are:"); //print combined along with entered numbers 		
		for (len = 0; len < marks.length; len++) //loop to print
		{			
			System.out.print("[" + marks[len] + "]"); 
		}
		System.out.println();
		System.out.print("Enter Highest marks or above: ");
		high = sc.nextInt();
		for (len = 0; len < marks.length; len++) //loop to print
		{	
			if (marks[len] > high) 
			{
				System.out.println("The highest marks is "+"[" + marks[len] + "]"); 
			}					
		}	
	}
}
