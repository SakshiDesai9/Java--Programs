import java.lang.*;
import java.util.*;
public class Array_6
{
    public static void main(String[]args)
    {
        int i=0;
        int Num []=new int[5];
        Scanner sc=new Scanner(System.in);

        //Display null value
        for(i=0;i<5;i++)
        {
            System.out.print("\n Value of element "+(i+1)+"="+Num[i]);
        }

        //Accepting user element from user
        for(i=0;i<5;i++)
        {
            System.out.print("\nEnter the value of element "+(i+101)+":");
            Num[i]=sc.nextInt();
        }
        System.out.print("\nEntered value in Array are: \n");
        //Display array with new values

        for(i=0;i<5;i++)
        {
            System.out.print("\n Value of element: "+(i+1)+"="+Num[i]);
        }







    }
}
