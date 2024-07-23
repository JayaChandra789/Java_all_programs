package nenu;
import java.util.Scanner;

public class OddEven                                                                      //shift + alt + r = rename
{
	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = user.nextInt();
			
		if (number%2==0) 
		{
			System.out.print(number + " is even ");
		}
		else 
		{
			System.out.print(number + " is odd ");
		}		
	}

}
