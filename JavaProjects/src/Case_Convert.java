import java.util.*;

public class Case_Convert
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.print("Enter the Character:");
        ch=sc.nextLine().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            char ch2=Character.toLowerCase(ch);
            System.out.print(ch2);
        }
        else {
            char ch2=Character.toUpperCase(ch);
            System.out.print(ch2);
        }


    }
}
