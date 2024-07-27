package nenu;
import java.util.Scanner;

public class Array1ex {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numbers[];
		numbers = new int[5];
		System.out.print("Enter values: ");
		for(int ind = 0;ind < numbers.length; ind++) 
		{
			numbers[ind] = sc.nextInt();
		}
		System.out.print("Numbers are:");
		for (int ind = 0; ind < numbers.length; ind++) 
		{
			
			System.out.print(numbers[ind] + ",");
		}
		
	}

}
