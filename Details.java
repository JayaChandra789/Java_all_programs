package newproject;
import java.util.Scanner;

public class Details
{
  public static void main(String[] args) 
  {
	  Scanner user = new Scanner(System.in); // System input
	  System.out.print("Enter name: ");
	  String name = user.nextLine();  // u can next(); for no space entry
	        
	  System.out.print("Enter age: ");
	  int age = user.nextInt();
	  user.nextLine(); // Consume the newline character
	        
	  System.out.print("Enter Address: ");
	  String address = user.nextLine();
	        
	  System.out.print("Enter mobile number: ");
	  int mobile_number = user.nextInt();
	        
	  System.out.println("Name: " + name +"," + " Age: " + age +","
	  + " Address: " + address +"," + " Mobile_number: " + mobile_number+".");
	        
	    
	}
}
