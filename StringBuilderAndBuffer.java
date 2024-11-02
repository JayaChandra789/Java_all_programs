package nenu;
import java.util.*;

class StringManipulations
{
	StringBuilder obj = new StringBuilder("Hello");
	public void operationsOnString() /*For string builder or buffer process is same differ in performance 
									and a method need to be created to perform operations must*/
	{
	obj.append(" ai"); //append()
	obj.insert(6, " H"); //insert(index," ")
	
	System.out.println(obj);
	obj.reverse(); //inbuilt reverse() method
	System.out.println(obj);
	}
}
public class StringBuilderAndBuffer 
{
	public static void main(String[] args) 
	{
		StringManipulations stringObj = new StringManipulations();
		stringObj.operationsOnString();
	}

}
