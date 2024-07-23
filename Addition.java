package nenu;
import java.util.Scanner;

public class Addition 
{

    public static void main(String[] args) 
    {                    //shift + Alt + r = rename option
        Scanner user = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = user.nextInt();
        System.out.print("Enter num2: ");
        int num2 = user.nextInt();

        int sum = num1 + num2;
        for (int i = 1; i <= 20; i++) 
        {
            System.out.print("*");
        }
         System.out.println(); // New line after the stars for better formatting
        
        if (num1 < num2) 
        {
            System.out.println("The addition is: " + sum);
        } else 
        {
            System.out.println("The addition is not supported, num1 is greater");
        }
        for (int i = 1; i <= 20; i++) 
        {
            System.out.print("*");
        }
    }
    
}
