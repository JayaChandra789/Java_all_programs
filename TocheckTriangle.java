package nenu;
import java.util.Scanner;

public class TocheckTriangle 
{
	public static void main(String[] args) 
	{
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter Triangle 1: ");
		int triangle_1 = user_input.nextInt();
		System.out.print("Enter Triangle 2: ");
		int triangle_2 = user_input.nextInt();;
		System.out.print("Enter Triangle 3: ");
		int triangle_3 = user_input.nextInt();;
		int total_triangle = (triangle_1+triangle_2+triangle_3);
		
		if(total_triangle == 180) 
		{
			System.out.print("Entered Triangle is perfect triangle");
		}
		else 
		{
			System.out.print("Entered Triangle is not perfect Triangle");
		}
	}

}
