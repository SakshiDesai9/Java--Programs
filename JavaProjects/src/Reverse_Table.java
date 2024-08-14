import java.util.*;

public class Reverse_Table 
{
    public static void main(String[] args)
     {
        int Num=1;
        Scanner S =new Scanner(System.in);
         System.out.println("Enter the number:");
         Num=S.nextInt();

        for(int i=10;i>=1;i--)
        {
            System.out.println(Num + " * " +i +" = " +Num*i);
        }


    }
    

    
}
