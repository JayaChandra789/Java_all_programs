package oopsExamples;

class AreaCalculator  //CLASS 
{
    public void calculateArea(int base, int height)  //METHOD OF TRIANGLE  
    {
        double area = 0.5f * base * height;              /*   */
        System.out.println("The area of Triangle is: " + area);
    }

    public void calculateArea(int side) //METHOD OF SQUARE
    {
        int area = side * side;
        System.out.println("The area of Square is: " + area);
    }

    public void calculateArea(float length, int width) //METHOD OF RECTANGLE
    {
        float area = length * width;
        System.out.println("The area of Rectangle is: " + area);
    }

    public void calculateArea(float radius) //METHOD OF CIRCLE
    {
        double area = 3.14159f * radius * radius;  
        System.out.println("The area of Circle is: " + area);
    }
}

public class Polymorphismex2 //MAIN CLASS
{
    public static void main(String[] args) //MAIN METHOD
    {
        AreaCalculator ACobj = new AreaCalculator();  //OBJECT CREATION
        ACobj.calculateArea(2, 20);   //CALCULATE AREA OF TRIANGLE
        ACobj.calculateArea(4);        //CALCULATE AREA OF SQUARE
        ACobj.calculateArea(3.5f, 5);   //CALCULATE AREA OF RECTANGLE
        ACobj.calculateArea(3.1f);    //CALCULATE AREA OF CIRCLE
    }
}
