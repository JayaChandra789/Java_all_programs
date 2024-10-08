package nenu;
import java.util.Scanner; //Importing Scanner class

public class AreaPerimeterOfRectangle //main class 
{
	public static int rectangle_area (int len,int width) //Area Method with parameters len & width
	{
		int area = len * width;	//Formula for area
		return area	;
	}
	public static int rectangle_perimeter (int len,int width)//Perimeter Method with parameters len & width
	{
		int widt = 2*(len + width);	//Formula for Perimeter
		return width	;
	}
	
	public static void main(String[] args) //main method
	{
		Scanner sc = new Scanner(System.in); //Object for scanner class
		   // Input for length
        System.out.print("Enter length of rectangle: "); // Message
        len = sc.nextInt(); // Assign input to static variable len

        // Input for width
        System.out.print("Enter width of rectangle: "); // Message
        width = sc.nextInt(); // Assign input to static variable width

        // Calculate and display area
        System.out.println("Area of rectangle is: " + rectangle_area());

        // Calculate and display perimeter
        System.out.print("Perimeter of rectangle is: " + rectangle_perimeter());

        sc.close(); // Close the scanner to prevent resource leaks
				
	}

}
