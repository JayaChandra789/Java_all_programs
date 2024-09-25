package oopsExamples;

abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is a Two Wheeler");
	}
	abstract void run(); /*Use colon to end METHOD 
	    as abstract method has no body only when if we use abstraction keyword*/
	public void display()
	{
		System.out.println("True");
	}

}
class PetrolBike extends Bike
{
	public void run()
	{
		System.out.println("Can run on Petrol");
	}
}

public class Abstraction 
{
	public static void main(String[] args) 
	{
      PetrolBike apache = new PetrolBike();
      apache.run();

	}
}
