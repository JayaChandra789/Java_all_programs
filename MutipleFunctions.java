package nenu;

import java.util.Scanner;

public class MutipleFunctions 
{
	public static void add(int a ,int b)
	{
		int sum = a + b;
		System.out.println("The Addition of " + a + " & " + b + " is " + sum);
	}
	public static void sub(int a ,int b) 
	{
		int sub = a - b;
		System.out.println("The Subtraction of " + a + " & " + b + " is " + sub);
	}
	public static void multiplication(int a ,int b) 
	{
		int mul = a * b;
		System.out.println("The Multiplication of " + a + " & " + b + " is " + mul);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		
		add(a,b);
		sub(a,b);
		multiplication(a,b);
	}

}
