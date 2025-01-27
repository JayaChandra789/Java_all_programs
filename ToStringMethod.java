package nenu;

class Jaya
{
	String name;
	int age;
	
	public Jaya(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	/*here toString method can be defined in two ways like same method name or Custom method name*/
	/*But when we use custom name we need to print object explicitly woth ojbect.stringMethodNAme()*/
	/*If method name is toString() no need of printing explicitly just call object that's it.*/
	/*Explicit method is displayed in another program visit CustomtoStringMethod class program*/
	public String toString()
	{
		return "\n------------------------" +
				"\n Name: "     + name+
				"\n Person Age: "+ age +
				"\n------------------------\n";
	}
}
public class ToStringMethod 
{
	public static void main(String[] args) 
	{
		Jaya jai = new Jaya("Chandra",22);
		System.out.println(jai);
	}
}
