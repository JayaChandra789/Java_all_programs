package oopsExamples;
import java.util.Scanner;
//Define the superclass Car
class Cars 
{
	String carBrand;
	String carType;
	String carFuelType;
class Car extends Cars	
{
	public void inputCar() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car Brand like MAhindra: ");
		carBrand = sc.nextLine();
		System.out.print("Enter car Type like SUV,XUV etc.. : ");
		carType = sc.nextLine();
		System.out.print("Enter car Fuel Type like petrol,Diesel : ");
		carFuelType = sc.nextLine();
		System.out.print("The entered brand is :" + carBrand + "Body type is:" + carType +
				"Car Fuel Type is: " + carFuelType );
	}
	public void displayCar() 
	{
		System.out.print("As you entered details "
				+ "we have Suitable "
				+ "car for you they are: Xuv300,XUV500 AND XUV 700 As per your mentioned specifications");
	}
}
//Define the subclass Mahindra, inheriting from Car

//Main class to test the functionality
public class  Carmain
{
	public static void main(String[] args) 
	{
		// Create an instance of Mahindra
		Carmain mahindraVehicle = new Carmain();     
		// Call methods from both the Car class and Mahindra class
		mahindraVehicle.inputCar();
		mahindraVehicle.displayCar();
		
	}
}
}

