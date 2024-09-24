package oopsExamples;
import java.util.Scanner;

public class CombineStr 
{
    public static void main(String[] args) 
    {
        // Create a scanner to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare string variables 
        String s1, s2,concate;
        
        // Ask the user to input
        System.out.print("Enter sentence 1:");
        s1 = sc.nextLine();
        System.out.print("Enter sentence 2:");
        s2 = sc.nextLine();
        
        // Here we Concatenate the two strings :)
        concate = s1 + " " + s2;
        
        // Print the concatenated result
        System.out.println("The concatenated result is: " + concate);
        sc.close();
    }
}
