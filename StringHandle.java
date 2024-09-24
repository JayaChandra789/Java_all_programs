package oopsExamples;

public class StringHandle
{

	public static void main(String[] args) 
	{
		String s1 = "jaya";
		String s6 = "jaya";
		String s2 = "Jaya";
		String s3 = "Jaya ";  //Same value but small difference like spaces so references  changes
		System.out.println("S1 reference: " + s1.hashCode());
		System.out.println("S2 reference: " + s2.hashCode());
		System.out.println("S3 reference: " + s3.hashCode());
		System.out.println("S6 reference: " + s6.hashCode());  //Same ref same obj of s1
		
		String s4 = new String("jaya"); //using new objects are creating as new seperate objects even if ref same
		System.out.println("S4 reference: " + s4.hashCode());  //Same reference diff object
		String s5 = new String("jaya");
		System.out.println("S5 reference: " + s5.hashCode());  //same ref diff obj
		
		//Boolean compare
		String s7 = "123";
		String s8 = "123";
		boolean result =s7.equals(s8); //use boolean "DATA TYPE."
		System.out.println(result); //Also can use IgnoreCase also To compare
		
		//lower case method
		String lowercaseString = s4.toLowerCase();
		System.out.println("To lower case from Jaya to " + lowercaseString);
		//upper case method
		String s9 = "chandra";
		String uppercaseString = s9.toUpperCase();
		System.out.println("Upper case from chandra to " + uppercaseString); //using varaibles in print as strings are immutable
		
	}

}
