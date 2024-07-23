package nenu;

public class Triangle 
{
	public class TriangleCheck 
	{
	    public static void main(String[] args) 
	    {	        
	        int angle1 = 60;  
	        int angle2 = 60; 
	        int angle3 = 60;  	       
	        if (angle1 + angle2 + angle3 == 180) 
	        {
	            System.out.println("The angles " + angle1 + ", " + angle2 + 
	            		","+ " and " + angle3 + " form a triangle.");
	        } 
	        else 
	        {
	            System.out.println("The angles " + angle1 + ", " + angle2 + 
	            		", "+ "and " + angle3 + " do not form a triangle.");
	        }
	    }
	}

}
