package oopsExamples;
import java.util.Scanner;

class Samsung //BASE CLASS 
{
	String brand,TVmodel,Specifications;
	Scanner sc = new Scanner(System.in);   //NICE MEMORY 'JAI'.DECLARE IN BASE CLASS AT BEGIN;
	public void TVinput()
	{
	    System.out.println("Welcome to Tv Show Room");
		System.out.print("Enter Brand Name: ");
		brand = sc.nextLine();
		System.out.print("Enter TV Model Like 'LCD' or 'LED': ");
		TVmodel = sc.nextLine();		
	}
	public void TVspecs() 
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
class TV extends Samsung   //Derived class
{
	public void TVpricesOfselectedTv() 
	{
		super.TVspecs();
		String price ;		
		price = " 4k(tv)=20K,Qled(tv)=30k,NeoQled(tv)= 60k";
		System.out.println("Prices of above TV's "+ super.Specifications+ " ," +price);
	}
	public void OrderTV() 
	{
		String order;
		System.out.print("Do you want to proceed with the order press"
				+ " yes if want to order else no: ");
		order=sc.nextLine();
		if (order.equalsIgnoreCase("yes")) 
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
public class SamsungTViheritnace 
{
	public static void main (String[] args) 
	{
		TV tvobj = new TV();
		tvobj.TVinput();
		tvobj.TVpricesOfselectedTv();
		tvobj.OrderTV();
	}
}
