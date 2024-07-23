package nenu;
public class SimpleIntrestcal
{ 
    public static void main(String[] args)
    {        
        double principal = 1000;  
        double rate = 5;          
        double time = 2;          
        double interest = (principal * rate * time) / 100;
        System.out.println("The Principal amount: " + principal);
        System.out.println("The Rate of interest: " + rate + "%");
        System.out.println("The Time period: " + time + " years");
        System.out.println("The Simple Interest: " + interest);
    }
}
