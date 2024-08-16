package oopsExamples;
import java.util.Scanner;

class cars //Define the superclass Car
{
	String carType,carFuelType,carVersion,selection,book; //Variables to be used 
	Scanner sc = new Scanner(System.in); //Scanner
	public void CarBMW_display()  //Method display list
	{
		System.out.println("Welcome to BMW ShowRoom ");
		System.out.println("Our cars are BMW 7 series");
		System.out.println("Our cars are BMW i8 Roadster");
		System.out.println("Our cars are BMW M series are availaible in our Showroom");
		System.out.println("Which car you would Like to select Enter your Specifications For car Booking:");	
	}
	public void CarBooking() //Booking Method & selections
	{
		System.out.print("Please select Type:");
		carType = sc.nextLine();
		System.out.print("Please select FuelType:");
		carFuelType = sc.nextLine();
		System.out.print("Please select carVersion('Sports or Street Fighter'):");
		carVersion = sc.nextLine();
		if (carType.equalsIgnoreCase("sedan") && carFuelType.equalsIgnoreCase("petrol") 
				&& carVersion.equalsIgnoreCase("sports"))
		{
			System.out.println("Nice selection " +carType+","+carFuelType+","+carVersion );
		}
		else if(carType.equalsIgnoreCase("suv") && carFuelType.equalsIgnoreCase("petrol") 
				&& carVersion.equalsIgnoreCase("Sports"))
		{
			System.out.println("Nice selection " +carType+","+carFuelType+","+carVersion );
		}
		else 
		{
			System.out.println("Enter Valid Option");
		}
		selection = carType + " "+carFuelType + " "+carVersion; //Storing all variables in one variable
	}
}
class Carcase extends cars	 //DERIVED CLASS use super KEYWORD FOR ACCEESING DERIVED CLASS VARAIBLES NAD CONTENT INIT
{
	public void Order() 
	{
		System.out.print("Press yes To Book car: ");
		super.book = super.sc.nextLine();
		if (book.equalsIgnoreCase("yes")) //equalsIgnoreCase(" ") for matching String like ==
		{
			System.out.println("Than you Choosing BMW " +super.selection +" Have nice day :)  ");
			System.out.println("Your order will be delivered Within One month");
		}
		else if (book.equalsIgnoreCase("no")) 
		{
			System.out.println("Order Not Proceeded,Hope you find best In Our BMW Next time" );  
		}
		else 
		{
			System.out.println("Invalid option ");
		}
	}
}
public class Car //Main class
{
	public static void main(String[] args) 
	{
		Carcase carobj = new Carcase(); //Car object for method calling
		carobj.CarBMW_display();
		carobj.CarBooking();
		carobj.Order();
	}
}