package nenu;

public class leapyear 
{

	public static void main(String[] args)
	{
        int year = 2004;
        if(year %4 == 0) 
        {
        	System.out.print("Year is leap year: " + year);
        }
        else if (year %400 == 0) 
        {
        	System.out.print("Year is leap year: " + year);
        }
        else if (year %100!=0) 
        {
        	System.out.print("Entered year is not leap year: " + year);
        }
	}

}
/*package nenu;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2004;

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}*/
