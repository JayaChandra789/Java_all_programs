package oopsExamples;
import java.util.Scanner;

public class ListofAnything //MAIN CLASS
{
    public static void main(String[] args) //MAIN METHOD
    {
        Scanner sc = new Scanner(System.in); //SCANNER CLASS
        int i, len; /*LEN OF ARRAY AND ITERATE VARAIBLE FOR LEN IS DEFINED
                     (suppose i<len=[len=3,i=0 so iterate 3 times until i=3])*/
        System.out.print("Enter length of LIST: "); //ASK SIZE OF ARRAY
        len = sc.nextInt();  //TAKES LEN/SIZE OF ARRAY
        sc.nextLine();//FOR STRING EXTRA LINE
        String my_list[] = new String[len]; //ARRAY INITIALIZATION
        for (i = 0; i < len; i++) //FOR LOOP TO ITERATE FROM i=0 TO UNTIL MATCHING LEN SIZE
        { 
            System.out.print("Enter a number: "); 
            my_list[i] = sc.nextLine();  //FOR ITERATING PURPOSE USE i FOR ARRAY ACC TO LEN WITH INPUT
        }
        System.out.print("Entered list elements: ");
        for (i = 0; i < len; i++) 
        { 
            System.out.print("["+my_list[i]+ "]");  /*ONLY USING LOOP ONLY WE CAN TAKE INPUT 
                                                    AND PRINT OUTPUT*/  
        }
    }
}
