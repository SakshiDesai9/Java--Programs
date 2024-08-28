import java.util.*;
public class Max_Of_Three_Number
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int N1,N2,N3;
        System.out.print("Enter the First Number:");
        N1= sc.nextInt();
        System.out.print("Enter the Second Number:");
        N2= sc.nextInt();
        System.out.print("Enter the Third Number:");
        N3= sc.nextInt();

        if(N1==N2 && N1==N3 && N2==N3)
        {
            System.out.println(N1+ " and " +N2+ " and " +N3+ " is a Same Number");
        }
        else if (N1>=N2 && N1>=N3)
        {
            System.out.println(N1 + " is Maximum");
        }
        else if (N2>=N1 && N2>=N3)
        {
            System.out.println(N2 + " is Maximum");
        }
        else
        {
            System.out.println(N3 + " is Maximum");
    }
    }
}
