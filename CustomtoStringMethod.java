package nenu;

class Jagan
{
	String name;
	int age;
	public Jagan(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	/*here toString method can be defined in two ways like same method name or Custom method name*/
	/*But when we use custom name we need to print object explicitly woth ojbect.stringMethodNAme()*/
	/*If method name is toString() no need of printing explicitly just call object that's it.*/
	public String describeJagan()
	{
		return "\n------------------------" +
				"\n Name: "     + name+
				"\n Person Age: "+ age +
				"\n------------------------\n";
	}
}
public class CustomtoStringMethod 
{
	public static void main(String[] args) 
	{
		Jagan jagan = new Jagan("Jagan",25);
		System.out.println(jagan.describeJagan());
	}
}
