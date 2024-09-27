package oopsExamples;

import java.util.Scanner;

class Area 
{
	// Method to calculate area of a circle
	public double area(double radius) 
	{
		return 3.141 * radius * radius;
	}

	// Method to calculate area of a square
	public double area(int side) 
	{
		return side * side;
	}

	// Method to calculate area of a rectangle
	public double area(int length, int width) 
	{
		return length * width;
	}
}
public class MethodOverload 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		Area areaObj = new Area();	
		
		do
		{
		System.out.println("-------------Available operations----------");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Sqaure");
		System.out.println("3. Area of rectangle ");
		System.out.println("---------------------------------------------");
		
		System.out.println("Select The Operation: ");
		int option = sc.nextInt();
		
			
			switch (option) 
			{
			case 1:
				System.out.print("Enter the radius of the circle: ");
				double radius = sc.nextDouble();
				System.out.println("Area of the circle: " + areaObj.area(radius));
				break;
			case 2:
				System.out.print("Enter the side length of the square: ");
				int side = sc.nextInt();
				System.out.println("Area of the square: " + areaObj.area(side));
				break;
			case 3:
				System.out.print("Enter the length of the rectangle: ");
				int length = sc.nextInt();
				System.out.print("Enter the width of the rectangle: ");
				int width = sc.nextInt();
				System.out.println("Area of the rectangle: " + areaObj.area(length, width));
				break;
			default:
				System.out.println("Invalid option! Please try again.");  
			}
			
			System.out.println("Enter O to terminate any or number to continue ");
			
			
			choice = sc.nextInt();
			
		}while(choice!=0);	
	}
}
