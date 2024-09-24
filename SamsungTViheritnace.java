package oopsExamples;
import java.util.Scanner;

class Tv //BASE CLASS 
{
	String brand,TVmodel,Specifications;
	Scanner sc = new Scanner(System.in);  //NICE MEMORY 'JAI'.DECLARE scanner IN BASE CLASS AT BEGIN;
	
	public void TVinput()   //input method
	{
	    System.out.println("Welcome to Tv Show Room");
		System.out.print("Enter Brand Name: ");
		brand = sc.nextLine();
		System.out.print("Enter TV Model Like 'LCD' or 'LED': ");
		TVmodel = sc.nextLine();		
	}
	public void TVspecs() //specification display method
	{
		System.out.print("Choose Specifications Like 4K,qled,Neoled:");
		Specifications = sc.nextLine();
		if (Specifications.equalsIgnoreCase("4K")) //.equalsIgnoreCase is used to match STRINGS
		{
			System.out.println("You Need "+Specifications+ "TV,best choice");
		}
		else if (Specifications.equalsIgnoreCase("qled"))
		{
			System.out.println("You Need "+Specifications+ "TV,best choice");
		}
		else if (Specifications.equalsIgnoreCase("neoled"))
		{
			System.out.println("You Need "+Specifications+ "TV,best choice");
		}
		else 
		{
			System.out.println("Invlaid Option choose correct one");
		}	   
	}
}
class Samsung extends Tv   //Derived class or sub class inherits the properties from baseclass or parent class
{
	public void TVpricesOfselectedTv() //selection method
	{
		super.TVspecs();
		String price ;		
		price = " 4k(tv)=20K,Qled(tv)=30k,NeoQled(tv)= 60k";
		System.out.println("Prices of above TV's "+ super.Specifications+ " ," +price);
	}
	public void OrderTV() //oder TV method
	{
		String order;
		System.out.print("Do you want to proceed with the order press"
				+ " yes if want to order else no: ");
		order=super.sc.nextLine();
		if (order.equalsIgnoreCase("yes"))   //.equalsIgnoreCase used like '==' for string
		{
			System.out.println("Order proccessed,THANK YOU FOR SHOPPING IN SAMSUNG HAVE A NICE DAY :)");
		}
		else if (order.equalsIgnoreCase("no")) 
		{
			System.out.println("Order not proccessed");
		}
		else 
		{
			System.out.println("Invalid command ");
		} 
	}
}
public class TViheritnace //Main class
{
	public static void main (String[] args) //Mian method
	{
		Scanner scan = new Scanner(System.in);  //Scanner class
		String exit; //To continue shopping varaibles is needed so it is the variabile which takes yes or no input
		do //do while loop
		{
		Samsung tvobj = new Samsung(); //created object for child class(Here object is created for only Derived class in inheritance method)
		tvobj.TVinput();   //calling all methods by using objects
		tvobj.TVpricesOfselectedTv();
		tvobj.OrderTV();
		System.out.print("Enter 'YES' / 'NO' for continue or exit shopping."); //if user press yes then its terminated or else start shop again
		exit=scan.nextLine(); //Takes input from user
		}
		while(exit.equalsIgnoreCase("yes"));
		System.out.print("END");
	}
}
