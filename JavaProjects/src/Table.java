import java.util.*;
public class Table
{
    public static void main(String[]args)
    {
        int Num=0;
        int i=1;
        Scanner S=new Scanner(System.in);

        System.out.print("\n Enter The Number:");
        Num=S.nextInt();

        //while(i<=10)
        for(i=1;i<=10;i++)
        {
            System.out.print("\n" + Num+  " * " + i + " = " + Num*i);
           // i++;
        }
    }
}
