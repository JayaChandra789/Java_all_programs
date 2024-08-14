package oopsExamples;

//cration of class with name car
class Carss
{	
	String brand="Mahindra";
	String model="XUV700";
	// method for displaying the details of car
	public void display()
	{
		System.out.println("the car brand is :"+ brand);
		System.out.println("the car model is :"+ model);		
	}
	//method for car tyres
	public void tyres()
	{
		System.out.println("Car is having 4 tyres");
	}
	//method for car colour
	public void colour()
	{
		System.out.println("Car colour is RED");
	}
}
//creating a class and getting features from car class to the derived class
class Mahindhra extends Carss //Derived class or child class From Parent class
{
	int maxSpeed=180;
	//method to display the details of the mahindraa
	public void MahindraCarDetails()
	{
		System.out.println("This car brand is:"+super.brand);

		System.out.println("This car model is:"+super.model);

		System.out.println("The car maximum speed is: "+maxSpeed);
		super.colour();
		super.tyres();
	}	
}
//main class
public class CarShowRoom 
{
	public static void main(String[] args) 
	{
		//object creation for mahindra class
		Mahindhra obj=new Mahindhra(); 

		obj.MahindraCarDetails(); //calling Child class using Mahindra OBJECT
	}
}
