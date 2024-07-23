package nenu;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = user_input.nextInt();
		System.out.print("Enter number 2: ");
		int b = user_input.nextInt();
		System.out.println("1.[For-Add],2.[For-Sub],"
				+ "3.[For-Multiply],4.[For-Division]");
		System.out.print("Enter operations: ");
		int cal = user_input.nextInt();
		
        switch(cal)
        {
        case 1:
        	double add = a + b;
        	System.out.print("Addition is: " + add);
        	break;
        case 2:
        	double sub = a - b;
        	System.out.print("Subtraction is: "+ sub);
        	break;
        case 3:
        	double multiply = a * b;
        	System.out.print("Multiplication is: " +multiply);
        	break;
        case 4:
        	double division = a / b;
        	System.out.print("Division is: "+ division);
        	break;
        default:
        	System.out.print("Invalid");
        	break;
        }
        user_input.close();
	}
}
