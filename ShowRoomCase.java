package oopsExamples;

import java.util.Scanner;
class ShowRoomCase
{
    String name;
    long mobile_no;
    double cost;
    double discount;
 ShowRoomCase()
{
    name =" ";
    mobile_no = 0;
    cost = 0;
    discount = 0;
}
 void input()
{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter name bro: ");
    name = sc.nextLine();
    System.out.print("Enter Mobile_no: ");
    mobile_no = sc.nextLong();
    System.out.print("Enter Cost: ");
    cost = sc.nextDouble();
}
void calculate()
{
    if (cost > 2000) 
    {
            discount = 0.2 * cost;  // 20% discount
    }
    else if (cost > 1000) 
    {
    discount = 0.1 * cost;  // 10% discount
    }
    else 
    {
        discount = 0;  // No discount
    }
}
void display()
{
    System.out.print("Customer Name is: " + name);
    System.out.print("Customer mobile_no is: " + mobile_no);
    System.out.print("Cost is: " + cost);
    System.out.print("Discount is: " + discount);
}
class ShowRoomOperations 
 {
    public static void main(String[] args) 
    {
        ShowRoomCase showroomobj = new ShowRoomCase(); // Creating object to call methods
        showroomobj.input();
        showroomobj.calculate();
        showroomobj.display();
    }
 }
}

