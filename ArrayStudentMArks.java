

import java.util.Scanner; //importing Scanner class

public class ArrayStudentMArks  //Mian class student marks
{
	public static void main(String[] args) //Main method
	{
		Scanner sc = new Scanner(System.in); 
		int len ; //Member varaibles
		int high = 0; //Initially zero marks in array
		int marks[] = new int[3]; // Creating New array to store		
		System.out.println("Enter marks to print in list ");  //Print message
		
		for(len = 0;len < marks.length; len++) //Loop for iteratinf array 3times
		{
			System.out.print("Enter marks: ");
			marks[len] = sc.nextInt();  //input from user stores in array until length match			
		}		
		System.out.print("Entered marks are:"); //print  message		
		for (len = 0; len < marks.length; len++) //loop to print toal marks here
		{			
			System.out.print("[" + marks[len] + "]"); //Using this message
		}
		System.out.println();

		high = marks[0];
		for (len = 0; len < marks.length; len++) //loop to print
		{	
			if (marks[len] > high) //Condition
				high = marks[len];
			{
				 
			}
		}
		System.out.println("The highest marks is "+"[" + high + "]");
	}
}
