import java.util.*;
public class Tables_Range {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int R1,R2;
        int Num=0;
        System.out.print("Enter the Start Number:");
        R1= sc.nextInt();
        System.out.print("Enter the End Number:");
        R2= sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.print("\n" + Num+  " * " + i + " = " + Num*i);
            // i++;
        }
    }
}
