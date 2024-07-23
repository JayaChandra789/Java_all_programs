package nenu;
import java.util.Scanner; //scanner syntax

public class Weekswitch {

	public static void main(String[] args) 
	{
	 	Scanner user_input = new Scanner(System.in); //scanner syntax
	 	System.out.print("Enter day num: ");
	 	int day = user_input.nextInt(); //scanner syntax
	 	String days;  //conversion
	 	
	 	switch(day) //switch conversion or start
	 	{
	 	case 1:
	 		days="Monday";
	 		break;
	 	case 2:
	 		days="Tuesday";
	 		break;
	 	case 3:
	 		days="Wednesday";
	 		break;
	 	case 4:
	 		days="Thursday";
	 		break;
	 	case 5:
	 		days="Friday";
	 		break;
	 	case 6:
	 		days="Saturday";
	 		break;
	 	case 7:
	 		days="Sunday";
	 		break;
	 		default :  //mandatory to execute print
	 			days = "invalid";
	 			break;
	 	}
	 	System.out.print(days);
	 	user_input.close();  //Scanner syntax part close for cursor position
	}

}
