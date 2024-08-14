package oopsExamples;

public class StaticVaraible 
{
	int a = 20;
	static int b = 40;
	/*---Static can accessible in any class or out of scope---*/ 
	void cal() 
	{
		a = a + b;
		b = b + a;      //increment
		System.out.println(a);
		System.out.print(b);
	}

	class StaticNumber
	{
		public static void main(String[] args) 
		{
			StaticVaraible StaticObj = new StaticVaraible();
            StaticObj.cal();
		}
	}
}
