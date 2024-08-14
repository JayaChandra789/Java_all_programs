package oopsExamples;
import java.util.Scanner;
class ShowRoomOperation 
{
    String name;
    long mobile_no;
    double cost;
    double discount;
ShowRoomOperation() //default constructor we can access variables in whole program
{
    name="";
    mobile_no=0;
    cost=0;
    discount=0;
}
void input()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name: ");
    name=sc.nextLine();
    System.out.print("Enter mobile no: ");
    mobile_no=sc.nextInt();
    System.out.print("Enter cost no: ");
    cost=sc.nextInt();
 }
void discount_of()
    { 
   if (cost <= 10000) 
		{
			discount = 5.0;
		} 
		else if (cost <= 20000) 
		{
			discount = 10.0;
		}
		else if (cost <= 35000) 
		{
			discount = 15.0;
		} 
		else 
		{
			discount = 20.0;
		}
       double amount = cost - (cost * discount / 100);
	}
void display()
  {
    System.out.println("Customer name is:" + name);
    System.out.println("Customer Mobile number is:" + mobile_no);
    System.out.println("Cost is:" + cost);
    System.out.println("Discount is: " + discount);
  }
public static void main(String[] args)
{
  ShowRoomOperation showroom_obj = new ShowRoomOperation();
    showroom_obj.input();
    showroom_obj.discount_of();
    showroom_obj.display();
}
}