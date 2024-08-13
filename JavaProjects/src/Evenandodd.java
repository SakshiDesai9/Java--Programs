import java.util.*;
import java.lang.*;

public class Evenandodd
{
    public static void main(String[] args) {

        int Num=0;
        Scanner S=new Scanner(System.in);

        System.out.println("\n Enter a number:");
        Num=S.nextInt();
        if(Num % 2==0)
        {
            System.out.println(Num + " is even number." );
        }
        else
        {
            System.out.println(Num + " is odd number.");
        }

    }
}
