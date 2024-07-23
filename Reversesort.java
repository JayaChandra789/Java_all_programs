package nenu;
public class Reversesort 
{
    public static void main(String[] args) 
    {
        // Number to be reversed
        int number = 12345;
        // Variable to store the reversed number
        int reversedNumber = 0;
        int originalNumber = number; // Store original number for output
        // Reverse the number using division
        while (number != 0) 
        {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append digit to reversedNumber
            number = number / 10;  // Remove the last digit from number
        }
        // Print the original and reversed numbers
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}