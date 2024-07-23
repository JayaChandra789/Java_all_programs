package nenu;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{	//with user input
	  Scanner user_input = new Scanner(System.in);
	  System.out.print("Enter Table number you want to print: ");
      int table_num = user_input.nextInt();
      
      for (int i = 1; i<=10; i++) 
      {
    	System.out.println(table_num + " * " + i + " = " + table_num*i);  
      }
	}

}
