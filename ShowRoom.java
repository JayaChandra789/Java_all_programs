package oopsExamples;
import java.util.Scanner;

class ShowRoom //class showRoom to store data 1.Class
{
	String name; //
	long mobno;  //
	double cost;  //
	double discount; //
	double amount;
	// Default constructor to initialize data members
	ShowRoom() //---->Default constructor<---- same as class name, 2.constructor
	{
		name = " "; //stores all data
		mobno = 0;
		cost = 0.0;
		discount = 0.0;
		amount = 0.0;
	}
	void input() //input method is created to take input 3.Method
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		name = sc.nextLine();

		System.out.print("Enter mobile number: ");
		mobno = sc.nextLong();

		System.out.print("Enter cost of items purchased: ");
		cost = sc.nextDouble();
	}
	// Method to calculate discount based on the cost
	void calculate()          //4.Method
	{
		if (cost <= 10000) //Checks cost is Greater than 10000
		{
			discount = 5.0;
		} 
		else if (cost <= 20000) //Checks cost is Greater than 20000
		{
			discount = 10.0;
		}
		else if (cost <= 35000) //Checks cost is Greater than 35000
		{
			discount = 15.0;
		} 
		else                     //else it returns 20.0
		{
			discount = 20.0;
		}
		amount = cost - (cost * discount / 100);  //
	}
	void display()            //5.Method to display
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Mobile Number: " + mobno);
		System.out.println("Amount to be paid after discount: " + amount);
	}
}                        //Separate class
class ShowRoomOperation
{
	public static void main(String[] args) //6.Main method to call all methods
	{
		ShowRoom showroomObj = new ShowRoom(); //Creating Object to call method
		showroomObj.input();
		showroomObj.calculate();
		showroomObj.display();
	}
 }
