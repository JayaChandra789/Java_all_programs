package oopsExamples;
import java.util.Scanner;  //Scanner class 

class ShowUserPass  //base class
{
	String user,pass;   //Initializing variables
	Scanner sc = new Scanner(System.in); //Scanner class
	public void declare()       //Method to declare
	{
		user = "jaya789";//Assign it 
		pass = "12345";  //Assign it to check match
	}
	public void check()  //Method to check input user and pswd
	{
		System.out.print("Enter User Name: ");
		user=sc.nextLine();
		System.out.print("Enter PassWord: ");
		pass=sc.nextLine();
		if(user.equalsIgnoreCase("jaya789") && pass.equalsIgnoreCase("12345"))
		{
			System.out.println("User name & Password matches");
		}
		else 
		{
			System.out.println("Invalid Crendentials Re-Enter UserName & Password");
		}
	}
}
public class UserPassCheck   //Main class
{
	public static void main(String[] args)   //Main method
	{
		Scanner scan = new Scanner(System.in);   //Scanner for main class
		String exit;    //Exit variable to store yes or no
		do
		{
			ShowUserPass userOBJ = new ShowUserPass();   //Object for method calling
			userOBJ.declare();
			userOBJ.check();

			System.out.print("Do you want try agian press 'YES' or if 'NO':");
			exit = scan.nextLine();         //Exit variable to enter or exit loop
		}
		while(exit.equalsIgnoreCase("yes"));  //While case to check yes or no.
		scan.close();  //Scanner close.  --->  ***  <---
	}
}