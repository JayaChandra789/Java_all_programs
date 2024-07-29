package nenu;

import java.util.Scanner;

public class Average_num {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		int ind ;
		int sum = 0;
		float avg;
		int numbers[] = new int[5]; // Creating New array to store		
		System.out.println("Enter values to print in list "); 
		
		for(ind = 0;ind < numbers.length; ind++) 
		{
			System.out.print("Enter value: ");
			numbers[ind] = sc.nextInt();  //input from user stores in array until length match			
		}		
		System.out.print("Entered Numbers are:"); //print combined along with entered numbers 		
		for (ind = 0; ind < numbers.length; ind++) //loop to print
		{			
			System.out.print("[" + numbers[ind] + "]" + ","); 
		}
		System.out.println();
		for (ind = 0; ind < numbers.length; ind++) //loop to print
		{	
			sum  +=  numbers[ind];					
		}	
		avg = sum / numbers.length;
		System.out.print("The avg is "+"[" + avg + "]"); 
	}
}
