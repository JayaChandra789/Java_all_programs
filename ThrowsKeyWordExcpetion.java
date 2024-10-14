package oopsExamples;
import java.util.Scanner;

/*-------------Custom Excpetion-------------*/
class NegativeAgeException extends Exception 
{
	NegativeAgeException(String msg)//Constructor
	{
		super(msg);
	}
}
class VoterEligibilty//class to check vote Eligibility
{
	boolean isEligible = false; //Boolean variables false initially
	Scanner sc = new Scanner(System.in); //Object for Scanner class
	VoterEligibilty() //Default constructor
	{
		System.out.print("Enter age in Years: "); //Message to user
	}
	public void VoteEligibleCheck() throws NegativeAgeException /*Method Of checking Eligibility of voter 
																along with throws keyword with negative age exception*/
	{
		int age = sc.nextInt();
		// Check for negative age
        if (age < 0) 
        {/*throws is used for a method */
            throw new NegativeAgeException("Entered age is negative.");
        }
        // Check eligibility based on age
        if (age >= 18) 
        {
            isEligible = true; //If true Prints below msg..
            System.out.println("Person is eligible for voting.");
        } 
        else 
        {
            isEligible = false;//If False Prints below msg..
            System.out.println("Entered age is not eligible for voting.");
        }
	}
}
/*------------------Main Class------------------*/
public class ThrowsKeyWordExcpetion 
{
	public static void main(String[] args) /*We can also implement throws here too.... For main method*/
	{
		VoterEligibilty voteObject = new VoterEligibilty();
		try
		{/*Here we need to know that we can raise exception for multiple exception 
		instead of writing multiple try & catch blocks for every excpetion just raise exception for each checked exception 
		(using '''throw new Exception_name("Message");''') only one catch block is needed.
		In order to maintain consistency and reduce redundancy which makes look the code Smaller*/
			voteObject.VoteEligibleCheck();
		}
		catch(NegativeAgeException obj)
		{
			System.out.println(obj);
		}
	}
}