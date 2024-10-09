package nenu;
import java.util.Scanner;
public class ExampleMethod //Main class
{	//Don't use colon here because starting function 
	//And 
	public static void addition(int num1 ,int num2) //Addition method
	{
		int sum = num1 + num2; //Adding num1 , num2
		System.out.print("The addition of " + num1 + " & "+ num2 +" is "+sum);  //Printing sum of 2 numbers
	}
	public static void main(String[] args) //Main method
	{	
		Scanner sc = new Scanner(System.in); //Object for Scanner Class
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();  
		addition(num1,num2);
	}
}

