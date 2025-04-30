package nenu;

import java.util.*;

class ArrayRevs 
{
    void arrayRev() 
    {
        Scanner sc = new Scanner(System.in);
        String[] myList = new String[5];

        System.out.println("Enter 5 names:");
        for (int index = 0; index < myList.length; index++) 
        {
            System.out.print("Enter " + (index + 1) + "th name: ");
            myList[index] = sc.nextLine();
        }
/*Remember that Index is always (n-1) right so when you write code and try to revesrse always use index - 1 only mandate***/
        System.out.println("\nYou entered:");
        for (int index = myList.length - 1; index >=0 ; index--) 
        {
            System.out.println(myList[index]);
        }

        sc.close();
    }
}
class ArrayReverseIndex 
{
    public static void main(String[] args) 
    {
        ArrayRevs obj1 = new ArrayRevs();
        obj1.arrayRev();
    }
}

