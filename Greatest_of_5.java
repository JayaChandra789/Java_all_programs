package nenu;

public class Greatest_of_5 
{
    public static void main(String[] args) 
    {      
        int num1 = 25;  
        int num2 = 40;  
        int num3 = 15;  
        int num4 = 30;  
        int num5 = 20;  
       
        int greatest = num1;  

        if (num2 > greatest) 
        {
            greatest = num2;
        }
        if (num3 > greatest) 
        {
            greatest = num3;
        }
        if (num4 > greatest) 
        {
            greatest = num4;
        }
        if (num5 > greatest) 
        {
            greatest = num5;
        }
        System.out.println("The greatest number among " + num1 + ", " + num2 +
        ", "+ "" + num3 + ", " + num4 + ", and " + num5 + " is: " + greatest);
    }
}

