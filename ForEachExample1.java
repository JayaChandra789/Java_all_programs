package nenu;
import java.io.*;

class ForEachEx
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void example() throws IOException
	{
		System.out.print("Enter Array Size: ");
		int size = Integer.parseInt(br.readLine());
		
		String[] names = new String[size];
		System.out.println("Enter elemnets as per Size: ");
		for(int i=0;i<size;i++)
		{
			names[i] = br.readLine();
		}
		System.out.println("Entered Elemnets are: " + size);
		for(String j : names) //Here String in names refers to Retrieve string dataType from String Array
			//Retrieving data type should be same as declared array
		{
			System.out.println("[" + j + "]");
		}
	}
}
public class ForEachExample1 
{
	public static void main(String[] jaya) throws IOException 
	{
		ForEachEx obj = new ForEachEx();
		obj.example();
	}
}
