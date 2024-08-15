package oopsExamples;

import java.util.Scanner;

class ShowRoomTV
{
    String brand,model,specification;//USE VARAIBLES DECLARED IN BASE CLASS WITH SUPER KEY IN CHILD CLASS
    Scanner sc = new Scanner(System.in);
    public void inputTV()
    {
       System.out.print("Enter brand name: ");
       brand = sc.nextLine();
       System.out.print("Enter model of TV: ");
       model = sc.nextLine();
       System.out.println(brand+" "+model);
    }
    public void Specification()
    {
        
        System.out.print("Enter specifications like '4k','8k' or noeled: ");
        specification = sc.nextLine();
        if (specification.equalsIgnoreCase("4k"))
        {
            System.out.println("Nice selection " + brand+" " + model+" " +specification);
        }
        else if (specification.equalsIgnoreCase("8k"))
        {
            System.out.println("Nice selection " + brand+" " + model+" " +specification);
        }
        else if (specification.equalsIgnoreCase("neoled"))
        {
            System.out.println("Nice selection " + brand+" " + model+" " +specification);
        }
        else 
        {
            System.out.println("Invalid selection");
        }
    }
}
class SamsungTv extends ShowRoomTV
{
    String order;
    public void Order()
    {
    System.out.print("Press yes to proceed with order of "+brand+" "+model+" " + super.specification+":");
    order = sc.nextLine(); //CANT ABLE TO ACCESS SAME CLASS VARAIBLES BUT CAN ACCESS FROM BASE
    if (order.equalsIgnoreCase("Yes"))
    {
        System.out.println("Order proceeded succesfully. Thank you for shopping in " 
    +brand+ " Have a nice day :)");
    }
    else 
    {
        System.out.print("Order not proceded ");
    }
  }
}
public class TVshowcaseInheritance
{
    public static void main(String[] args)
    {
        SamsungTv TVobj = new SamsungTv();
        TVobj.inputTV();
        TVobj.Specification();
        TVobj.Order();
    }
}
