package nenu;
import java.util.*;

class StringReversewwithoutMethods
{
	Scanner sc = new Scanner(System.in);
	public void reverseString()
	{
		String letter = "Hello";/*Initialize Two varaibles like original */
		String reversed =" " ; /*Reversed with empty to store reversed string*/

		for(int i = letter.length() - 1; i>=0; i--) /*Working Mechanism */ /*(5 ; 5>=0 ; 5--) like 5 times decrease upto 0*/
		{											/*First store length of letter with - 1 in i
													as length decrease traversing is possible from back side*/
			reversed += letter.charAt(i); /*After traversing add each letter from back side */
			//System.out.println("Reversed String is: " + reversed);
		}
		System.out.println("Original String is: " + letter);
		System.out.println("Reversed String is: " + reversed);
	}
}
public class StringReverse 
{
	public static void main(String[] args) 
	{
		StringReversewwithoutMethods stringObj = new StringReversewwithoutMethods();
		stringObj.reverseString();
	}
}
