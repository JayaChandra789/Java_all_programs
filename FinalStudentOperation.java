package javaAdvance;
import java.util.*;

public class FinalStudentOperation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Creating object for StudentDataEntryInArrayList class of another program
		StudentDataEntryInArrayList obj3 = new StudentDataEntryInArrayList(); 

		int choice;
		do/*Do while loop*/
		{
			System.out.println("Enter 1 to insert data:");
			System.out.println("Enter 2 to insert data:");
			System.out.println("Enter 3 to insert data:");
			System.out.println("Enter 4 to insert data:");
			System.out.println("Enter 5 to insert data:");
			System.out.println("Enter 6 to insert data:");
			System.out.println("Enter 7 to insert data:");
			System.out.println("Enter 8 to insert data:");
			System.out.println("Enter 0 to Exit");

			int operation =sc.nextInt();
			/*=============Switch case=============*/
			switch(operation)
			{
			case 1:
				obj3.takeInputData();
				break;
			case 2:
				obj3.insertAtLast();
				break;
			case 3:
				obj3.insertAtFirst();
				break;
			case 4:
				obj3.removeFromFirst();
				break;
			case 5:
				obj3.removeFromLast();
				break;
			case 6:
				obj3.getFirstStudent();
				break;
			case 7:
				obj3.getLastStudent();
				break;
			case 0:
				System.out.println("Opted to exit");
				break;
			default :
				System.out.println("Entered option is invalid");
			}
			choice = sc.nextInt();
		}while(choice!=0);
	}
}
