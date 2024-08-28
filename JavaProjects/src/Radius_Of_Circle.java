import java.util.*;

public class Radius_Of_Circle
 {
    public static void main(String[] args) 
    {
        double pi=3.14;
        double area=0;
        double r=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:  ");
        r= sc.nextDouble();

        area= pi*r*r;
        System.out.print(" Radius of circle : " + area);
    }
    
    
}
