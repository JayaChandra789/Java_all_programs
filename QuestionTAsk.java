package patterns;
/*	
Write a program where a class Vehicle has a method startEngine().
 Create two subclasses Car and Bike that inherit from Vehicle and 
 add specific methods playMusic() and kickStart() respectively. 
 Demonstrate accessing methods of both parent and child classes.*/
class Vehicle
{
	public void startEngine()
	{
		System.out.println("Engine Started");
	}
}
//Sub class car
class Car extends Vehicle //Extending from parent class
{
	public void playMusic()
	{
		System.out.println("Playing music in car");
	}
}
//Sub class Bike
class Bike extends Vehicle  //Extending from parent class
{
	public void kickStart()
	{
		System.out.println("Bike kick Start");
	}
}
//Main class
public class QuestionTAsk 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Car task perofroms here");
		Car myCarObj = new Car(); //Creating object for Car class
		myCarObj.startEngine(); //Calling methods from super class and child class using object
		myCarObj.playMusic();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Bike task perofroms here");
		Bike myBikeObj = new Bike(); //Creating object for Car class
		myBikeObj.startEngine(); //Calling methods from super class and child class using object
		myBikeObj.kickStart();
	}

}
