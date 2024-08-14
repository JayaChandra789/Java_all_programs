package oopsExamples;

import java.util.Scanner;
/*--------- Base class -------------*/
class NumberInheritance
{
	/*----- Member variable ----*/
	int num1,num2;
	/*---- Method to input data from user through keyboard -----*/
	public void inputNumbers()
	{
		/*----- Object of Scanner class -----*/
		Scanner sc=new Scanner(System.in);
		/*--- input of data through keyboard ----*/
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		num2 = sc.nextInt();
		System.out.println("-----------------------------------------");
	}
	/*---- Method to display data ------*/
	public void displayNumbers()
	{
		System.out.println("----------------------------------------------");
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
	}
}
/*-------------------------------------------------------------------------------*/
/*------ Derived Class -------*/
class NumericCalculation extends NumberInheritance
{
	/*------ Method for addition of two numbers --------*/
	public void addition()
	{
		/*--- input of number ---*/
		super.inputNumbers();     //Method Calling
		/*---- Calculating addition ----*/
		int sum = super.num1 + super.num2;
		/*--- displaying numbers ----*/
		super.displayNumbers();    //Method Calling
		System.out.println("Sum = "+ sum);
		System.out.println("---------------------------------------");
	}
	/*----- Method for difference of two numbers -----*/
	public void difference()
	{
		/*--- input of number ---*/
		super.inputNumbers();
		/*--- calculating difference -----*/
		int sub = super.num1 - super.num2;
		System.out.println("Difference between "+super.num1+" and "+super.num2+" is : "+sub);
	}
}
/*--------------------------------------------------------------------*/
public class CalculationsInheritance 
{
	public static void main(String[] args) 
	{
		// Create object of derived class 
		NumericCalculation nc=new NumericCalculation();
		nc.addition();
		nc.difference();
	}
}

