package nenu;
import java.util.Scanner;

public class AreaPerimeterOfRectangle 
{
	public static int rectangle_area (int len,int width)
	{
		int area = len * width;	
		return area	;
	}
	public static int rectangle_perimeter (int len,int width)
	{
		int widt = 2*(len + width);	
		return widt	;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter len of triangle: ");
		int len = sc.nextInt();
		System.out.print("Enter Width of triangle: ");
		int width = sc.nextInt();
		
		int rectangle_area =  rectangle_area ( len, width);
		System.out.println("Area of reactangle is: " + rectangle_area);
		
		int rectangle_length =  rectangle_perimeter ( len, width);
		System.out.print("Perimeter of reactangle is: " + rectangle_length);
				
	}

}
