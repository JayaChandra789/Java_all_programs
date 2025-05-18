package javaAdvance;
import java.util.*;

public class StudentDataEntryInArrayList 
{
	private LinkedList<Students> obj1;

	StudentDataEntryInArrayList() /*Default constructor*/
	{
		obj1 = new LinkedList<Students>();
	}

	/*Method for taking input*/
	public Students takeInputData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student data");

		System.out.print("Enter Student Name: ");
		String sName = sc.nextLine();

		System.out.print("Enter Student ID: ");
		int sid = sc.nextInt();

		System.out.print("Enter Student Standard: ");
		int sStandard = sc.nextInt();

		System.out.print("Enter Student Age: ");
		int sAge = sc.nextInt();

		System.out.print("Enter Student Roll No.: ");
		int sRollNo = sc.nextInt();

		// Create and return a new Student object
		return new Students(sName, sid, sStandard, sAge, sRollNo);
	}
	// Method to insert student data at the last position
	public void insertAtLast() 
	{
		Students student = takeInputData();
		obj1.addLast(student);
		System.out.println("Student added at the end successfully!");
	}

	// Method to insert student data at the first position
	public void insertAtFirst() 
	{
		Students student = takeInputData();
		obj1.addFirst(student);
		System.out.println("Student added at the beginning successfully!");
	}

	// Method to remove student data from the first position
	public void removeFromFirst() 
	{
		if (!obj1.isEmpty()) 
		{
			Students removedStudent = obj1.removeFirst();
			System.out.println("Removed student from the beginning:" + removedStudent);
		} 
		else 
		{
			System.out.println("The list is empty, no student to remove from the beginning.");
		}
	}

	// Method to remove student data from the last position
	public void removeFromLast() 
	{
		if (!obj1.isEmpty()) 
		{
			Students removedStudent = obj1.removeLast();
			System.out.println("Removed student from the end:" + removedStudent);
		} 
		else 
		{
			System.out.println("The list is empty, no student to remove from the end.");
		}
	}
	// Method to get the first student data
	public void getFirstStudent() 
	{
		if (!obj1.isEmpty()) 
		{
			Students firstStudent = obj1.getFirst();
			System.out.println("First student in the list:" + firstStudent);
		} 
		else 
		{
			System.out.println("The list is empty, no student to display.");
		}
	}

	// Method to get the last student data
	public void getLastStudent() 
	{
		if (!obj1.isEmpty()) 
		{
			Students lastStudent = obj1.getLast();
			System.out.println("Last student in the list:" + lastStudent);
		} 
		else 
		{
			System.out.println("The list is empty, no student to display.");
		}
	}
	// Method to display all students' data
	public void showAllStudents() 
	{
		if (obj1.isEmpty()) 
		{
			System.out.println("No students to display.");
		} 
		else 
		{
			for (Students student : obj1) 
			{
				System.out.println(student);
				System.out.println("------------------------------");
			}
		}
	}
	public void displayData()
	{
		if(obj1.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			Iterator<Students> obj2 = obj1.iterator(); //Iterator to class Students generic
			while(obj2.hasNext())
			{
				System.out.println(obj2.next());
			}
		}
	}
}
