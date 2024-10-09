package oopsExamples;

import java.util.Scanner; // Importing Scanner class for user input

// Custom exception for handling negative radius input
class NegativeRadiusException extends Exception 
{
    NegativeRadiusException(String msg) 
    {
        super(msg); // Pass the message to the Exception class
    }
}

// Class for performing operations related to circles
class CircleOperations 
{
    float radius; // Variable to store the radius of the circle

    // Constructor to initialize radius from user input
    CircleOperations() 
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt user for the radius
        System.out.print("Enter radius of Circle: ");
        radius = sc.nextFloat(); // Read radius from user input
    }

    // Method to display the entered radius
    public void displayRadiusOfCircle() 
    {
        System.out.println("Entered radius: " + radius);
    }

    // Method to calculate area and perimeter of the circle
    public void calAreaAndPerimeterOfCircle() 
    {
        try 
        {
            // Check if the radius is negative
            if (radius < 0) 
            {
                throw new NegativeRadiusException("Radius can't be negative"); // Throw custom exception
            } else 
            {
                // Calculate area and perimeter
                double area = 3.141f * radius * radius; // Area of the circle
                double perimeter = 2 * 3.141f * radius; // Perimeter (circumference) of the circle

                // Display the calculated area and perimeter
                System.out.println("Area of Circle is: " + area);
                System.out.print("Perimeter of Circle is: " + perimeter);
            }
        } 
        catch (NegativeRadiusException obj) 
        {
            // Handle the negative radius exception
            System.err.println("Negative Radius Exception: " + obj); // Print the exception message
        }/*Or we can use obj.getMessage()  method to diaply or simply use obj...*/
    }
}
// Main class to handle circle operations
public class CircleExceptionHandle 
{
    public static void main(String[] args) 
    {
        // Create an instance of CircleOperations
        CircleOperations circleObj = new CircleOperations();
        
        // Display the radius of the circle
        circleObj.displayRadiusOfCircle();
        
        // Calculate and display the area and perimeter of the circle
        circleObj.calAreaAndPerimeterOfCircle();
    }
}
