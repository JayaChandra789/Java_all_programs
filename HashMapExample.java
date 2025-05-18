package javaAdvance;
import java.util.*;

class HashMapExamples
{
	public void enterDetails()
	{
		HashMap<Integer,String> obj1 = new HashMap<>();
		obj1.put(1,"Jaya");
		obj1.put(2,"Vijay");
		obj1.put(3,"Vijaya");
		obj1.put(4,"Ajay");
		obj1.put(5,"Sanjay");
		obj1.put(1,"Sanju Roy"); //Here value gets replaced in key 1

		System.out.print("Map is : ");
		System.out.println(obj1);
		
		obj1.put(5,"Jadeja"); //Here the value of key is replaced with Jadeja
		System.out.print("Map is : ");
		System.out.println(obj1);
		
		/*----- Inserting a new entry with existing key -----*/
		obj1.putIfAbsent(7,"Dhoni"); //If data not found element is added  but put replace value
		obj1.putIfAbsent(4,"Virat");
		System.out.print("Map is : ");
		System.out.print(obj1);
		
		/*----- Set view of keys of Map ----*/
		System.out.println("---------------------------------------");
		System.out.println("Map is : ");
		for (Integer keys : obj1.keySet()) 
		{
			System.out.println(keys + " - " +obj1.get(keys));
		}
		System.out.println("----------------------------------------");

/*-------------------------------------------------OR------------------------------------------------------------*/
		/*----- Using Entry Interface for Traversal of elements of Map -----*/
		/*----- Mostly try to use Key map instead of entrySet()-----*/
		Set setView=obj1.entrySet();
		/*---- Creating iterator ---- Enter Interface---*/
		Iterator studentIterator = setView.iterator();
		while(studentIterator.hasNext())
		{
			Map.Entry<Integer, String> entry = (Map.Entry)studentIterator.next();
			System.out.println(entry.getKey()+ " - " +entry.getValue());
		}
	}
}
public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMapExamples obj2  = new HashMapExamples();
		obj2.enterDetails();
	}
}
