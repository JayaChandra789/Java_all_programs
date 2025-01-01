package nenu;
import java.util.*;

class ForEachClass 
{
    Scanner sc = new Scanner(System.in);
    
    public void forEachMethod() 
    {
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] myArray = new String[size];
        // Populate the array with user input
        for (int i = 0; i < size; i++) 
        {
            System.out.println("Enter value for element " + (i + 1) + ": ");
            myArray[i] = sc.nextLine();
        }
        // Use for-each loop to display the array elements
        System.out.println("Array elements are:");
        for (String item : myArray) //For each is only used to print elements in array dont takes any input 
        {
            System.out.println(item);
        }
    }
}

public class ForEach 
{
    public static void main(String[] args) 
    {
        ForEachClass eObj = new ForEachClass();
        eObj.forEachMethod();
    }
}
