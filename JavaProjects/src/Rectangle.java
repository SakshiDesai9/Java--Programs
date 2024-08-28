import java.util.*;

public class Rectangle 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double Width=0, Height=0;
        double Area=0;
        System.out.println("Enter the Width :");
        Width=sc.nextDouble();
        System.out.println("Enter the Height:");
        Height=sc.nextDouble();

        Area=Width*Height;
        System.out.println("Rectangle : " + Area);
        



    }
    
}
