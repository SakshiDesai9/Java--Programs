import java.util.*;
import java.lang.*;
public class Daynumber
{
    public static void main(String[]args)
    {
        int day=0;
        Scanner S=new Scanner(System.in);

        System.out.println("\n Enter the number (1-7):");
        day=S.nextInt();

        if(day==1)
        {
            System.out.println("Monday.");
        }
        else if(day==2)
        {
            System.out.println("Tuesday.");
        }
        else if(day==3)
        {
            System.out.println("Wendseday.");
        }
        else if(day==4)
        {
            System.out.println("Thrusday.");
        }
        else if(day==5)
        {
            System.out.println("Friday.");
        }
        else if(day==6)
        {
            System.out.println("saturday.");
        }
        else if(day==7)
        {
            System.out.println("Sunday.");
        }
        else
        {
            System.out.println("Invalid Day Number.");
        }



    }
}
