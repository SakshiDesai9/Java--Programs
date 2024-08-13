import java.util.*;
import java.lang.*;

public class Maximumnumber
{
    public static void main(String[]args)
    {
        int Num1=0,Num2=0;
        Scanner S= new Scanner(System.in);

        System.out.println("Enter the First number:");
        Num1=S.nextInt();
        System.out.println("Enter the Second number");
        Num2=S.nextInt();

        if(Num1==Num2)
        {
            System.out.println(Num1 + " and " + Num2 + " is same.");
        }
        else if(Num1 > Num2)
        {
            System.out.println(Num1 + " is maximum.");
        }
        else
        {
            System.out.println(Num2 + " is maximum.");
        }

    }
}
