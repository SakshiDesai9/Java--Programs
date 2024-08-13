import java.util.*;
import java.lang.*;
public class Addition
{
    public static void main(String[]args)
    {
        int Num1=0,Num2=0;
        int add=0;
        Scanner S=new Scanner(System.in);

        System.out.print("\n Enter the first number:");
        Num1=S.nextInt();
        System.out.print("\nEnter the second number:");
        Num2=S.nextInt();

        add=Num1+Num2;
        System.out.println("The addition of " + Num1 + " and " + Num2 + " is :" + add);
    }
}
