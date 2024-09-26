package oopsExamples;
import java.util.Scanner;

public class CountConsonants //Main class
{
    public static void main(String[] args)  //Main method
    {
        Scanner sc = new Scanner(System.in); //Scanner class
        System.out.println("Enter any sentence:");//Dispaly Message
        String s1 = sc.nextLine().toLowerCase();  //Taking string from user Through keyboard and converting given Sentence to lower case
        System.out.println("Entered Sentence is: "+ s1);
        
        int consonants = 0; //Initially zero for increment
        System.out.println("Consonants present in the given sentence are: ");
        for (int index = 0; index < s1.length(); index++) /*For loop for checking and 
        	                                       traversing index wise each letter*/
        {
            char characters = s1.charAt(index); //Checking characters present at index
            // Check if the character is a consonant (not a vowel and is a letter)
            if (characters >= 'a' && characters <= 'z' && 
                characters != 'a' && characters != 'e' && 
                characters != 'i' && characters != 'o' && characters != 'u') 
            {
                System.out.println(characters + " "); //print the characters..
                consonants++; //Counting the consonants.
            }
        }     
        System.out.println("Total number of consonants: " + consonants);
    }
}
