package oopsExamples;

import java.util.Scanner; //Scanner Class

class NegativeRadiusException extends Exception 
{
	NegativeRadiusException(String msg) 
	{
		super(msg);
	}
}
class CircleOperations 
{
	float radius;
	CircleOperations()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of Circle: ");
		radius = sc.nextFloat();

	}
	public void displayRadiusOfCircle() 
	{  
		System.out.println("Entered radius: " + radius);
	}
	public void calAreaAndPerimeterOfCircle() 
	{
		try 
		{
			if (radius < 0) 
			{
				throw new NegativeRadiusException("Radius cant be negative");
			} 
			else 
			{
				double area = 3.141 * radius * radius; 
				double perimeter = 2 * 3.141 * radius;

				// Display the calculated area and perimeter
				System.out.println("Area of Circle is:"+ area);
				System.out.print("Perimeter of Circle is: "+ perimeter);
			}
		} 
		catch (NegativeRadiusException obj) 
		{
			System.out.println("Negative Radius Exception: " + obj);
		}
	}
}
public class CircleExceptionHandle 
{
	public static void main(String[] args) 
	{
		CircleOperations circleObj = new CircleOperations();
		circleObj.displayRadiusOfCircle(); // Get radius for area calculation

		circleObj.calAreaAndPerimeterOfCircle(); // Calculate area and perimeter
	}
}