package nenu;
import java.util.Scanner;

public class Array1ex 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); //new scanner is object stores in sc
		int ind ;  //creating varaible for using in loop used as storing index value.
		
		int numbers[] = new int[5]; // Creating New array to store
		/* int my_array []; and  my_array  = new int[];  ---> learner syntax */
		
		 //Array size or length + Use method numbers.length
		
		System.out.println("Enter values to print in list "); //show or display to enter numbers
		
		for(ind = 0;ind < numbers.length; ind++) //loop to store as many as user entered until it matches index = 5 from 0
		{
			System.out.print("Enter value: ");
			numbers[ind] = sc.nextInt();  //input from user stores in array until length match			
		}
		
		System.out.print("Entered Numbers are:"); //print combined along with entered numbers 
		
		for (ind = 0; ind < numbers.length; ind++) //loop to print
		{			
			System.out.print("[" + numbers[ind] + "]" + ","); /* To print number[0] to numbers[5] by using for loop +
			                                       ',' is used for---> every time it print [number ',' number] by loop. 
			                                       Means print complete line and go for next numbers*/
		}		
	}
}
