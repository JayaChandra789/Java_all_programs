package nenu;

public class TemperatureConvt 
{
   
    public static void main(String[] args) 
    {
        double fahrenheit = 98.6;
        
        double celsius = fahrenheit - 32 * 5 / 9;     
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        System.out.println("The temperature in Celsius is: " + celsius);
    }
}

