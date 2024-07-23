package nenu;
import java.util.Scanner;

public class Scannerlow 
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in) ;

	        System.out.print("Enter the age: ");
	        int age =  sc.nextInt();
	        sc.nextLine(); // use this extra for enter string after integer

	        System.out.print("Enter the name: ");
	        String name = sc.nextLine() ;
	        
	        System.out.println("Age: " + age);
	        System.out.println("Name: " + name);	        	     
	    }
	}

