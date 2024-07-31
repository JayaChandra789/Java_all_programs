package nenu;
import java.util.Scanner;
public class ExampleMethod 
{	//Don't use colon here because starting function 
	//And 
	public static void addition(int num1 ,int num2) 
	{
		int sum = num1 + num2;
		System.out.print("The addition of " + num1 + " & "+ num2 +" is "+sum);
	}
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();  
		//Use colon here to end function here
		addition(num1,num2);
	}
}

