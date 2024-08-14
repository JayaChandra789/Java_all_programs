package oopsExamples;
import java.util.Scanner;  //Importing scanner class to use scanner class

class SimpleIntrest  //Simple Interest class
{
	double principal;
	int    time;
	double rate;
	double interest;
	SimpleIntrest()   //Default Constructor
	{
		Scanner sc = new Scanner(System.in);  //Scanner class
		System.out.print("Enter principal Amount: ");  //Input from the User
		principal = sc.nextDouble();
		System.out.print("Enter rate: ");
		rate = sc.nextDouble();
		System.out.print("Enter time: ");
		time = sc.nextInt();	
	}
	void calculateIntrest() //calculate Interest method
	{	 
		interest = (principal * rate * time) / 100;   
	}
	void display() //Display method
	{
		System.out.println("The Principal amount: " + principal);
		System.out.println("The Rate of interest: " + rate + "%");
		System.out.println("The Time period: " + time + " years");
		System.out.println("The Simple Interest: " + interest);
	}
	class intrestcal  //Another class is used to use main method
	{
		public static void main(String[] args) 
		{
			SimpleIntrest intrestobj = new SimpleIntrest(); //Creating object for calling methods
			intrestobj.calculateIntrest(); //All methods calling
			intrestobj.display();
		}
	}
}