package oopsExamples;
import java.util.Scanner;

class cars // Define the superclass Car
{
    String carType, carFuelType, carVersion, selection, book; // Variables to be used
    Scanner sc = new Scanner(System.in); // Scanner

    public void CarBMW_display() // Method display list
    {
        System.out.println("Welcome to BMW ShowRoom ");
        System.out.println("Our cars are BMW 7 series");
        System.out.println("Our cars are BMW i8 Roadster");
        System.out.println("Our cars are BMW M series are available in our Showroom");
        System.out.println("Which car would you like to select? Enter your specifications for car booking:");
    }

    public void CarBooking() // Booking Method & selections
    {
        System.out.print("Please select Type: ");
        carType = sc.nextLine();
        System.out.print("Please select FuelType: ");
        carFuelType = sc.nextLine();
        System.out.print("Please select carVersion('Sports or Street Fighter'): ");
        carVersion = sc.nextLine();

        if (carType.equalsIgnoreCase("sedan") && carFuelType.equalsIgnoreCase("petrol")
                && carVersion.equalsIgnoreCase("sports")) 
        {
            System.out.println("Nice selection " + carType + ", " + carFuelType + ", " + carVersion);
        } 
        else if (carType.equalsIgnoreCase("suv") && carFuelType.equalsIgnoreCase("petrol")
                && carVersion.equalsIgnoreCase("Sports")) 
        {
            System.out.println("Nice selection " + carType + ", " + carFuelType + ", " + carVersion);
        } 
        else 
        {
            System.out.println("Enter Valid Option");
        }
        selection = carType + " " + carFuelType + " " + carVersion; // Storing all variables in one variable
    }
}

class Carcase extends cars // DERIVED CLASS use super KEYWORD FOR ACCESSING DERIVED CLASS VARIABLES AND CONTENT IN IT
{
    public void Order() 
    {
        System.out.print("Press yes To Book car: ");
        super.book = super.sc.nextLine();
        if (book.equalsIgnoreCase("yes")) // equalsIgnoreCase(" ") for matching String like ==
        {
            System.out.println("Thank you for choosing BMW " + super.selection + " Have a nice day :)  ");
            System.out.println("Your order will be delivered within one month");
        } 
        else if (book.equalsIgnoreCase("no")) 
        {
            System.out.println("Order not proceeded. Hope you find the best in our BMW next time.");
        } 
        else 
        {
            System.out.println("Invalid option.");
        }
    }
}

public class Car // Main class
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String continueBooking;
        do 
        {
            Carcase carobj = new Carcase(); // Car object for method calling
            carobj.CarBMW_display();
            carobj.CarBooking();
            carobj.Order();

            System.out.print("Do you want to book another car? (yes/no): ");
            continueBooking = sc.nextLine();
            System.out.println();

        } while (continueBooking.equalsIgnoreCase("yes"));

        System.out.println("Thank you for visiting BMW Showroom.");
        sc.close();
    }
}