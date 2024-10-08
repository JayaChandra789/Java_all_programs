package nenu;
import java.util.Scanner;

public class Array_names 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	String my_list [] = new String [3];
	int len ; // length always will be int data type only, because it is integer value
	System.out.println("Enter 3 names to print list: ");
	
	for (len=0;len < my_list.length;len++)  
	{
		System.out.print("Enter name to print list: ");
		my_list[len] = sc.nextLine();  //here always use **array_name[varaible_name of length]**
	}
	System.out.print("Entered 3 names are: "); //prints message
	
	for (len=0;len < my_list.length;len++) //loop for printing input taken from user && for array 2 llops are used for taking input and printing output
	{
		System.out.print(my_list[len] + "+"); // here use both array_name and index_name to print elements in array
	}
	sc.close();
	}
}
