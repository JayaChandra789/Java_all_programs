package nenu;

public class Without3rdvar {

	public static void main(String[] args) 
	{
		int a = 50;
		int b = 100;
		
		 a = a + b;
		 b = a - b;
		 a = a - b;
		 System.out.println("Swap of a: " + a);
		 System.out.print("Swap of b: " + b);
			
	}

}
