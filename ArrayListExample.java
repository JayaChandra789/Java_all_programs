package javaAdvance;
import java.util.*;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index (1): " + list.get(1));

        // Iterating over elements
        System.out.println("ArrayList elements:");
        for (String fruit : list)  //Iterating using For each Loop 
        {
            System.out.println(fruit);
        }
        System.out.println();
        
        //OR
        /*----------------------Using Iterator----------------------*/
        Iterator obj2 = list.iterator(); //Creating Iterator as ArrayList is Implemented using Iterable Interface
        System.out.println("-----------Using Iterator--------------");
        while(obj2.hasNext())
        { 
        	 System.out.println(obj2.next());
        }
        System.out.println("---------------------------------------");
        // Removing an element
        list.remove("Banana");
        System.out.println("After removal: " + list);
    }
}
