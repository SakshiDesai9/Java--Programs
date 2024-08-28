import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double Fahrenheit=0 , Celsius=0;

        System.out.println("Enter the Temperature in Fahrenheit :");
        Fahrenheit=sc.nextDouble();

        Celsius = ((Fahrenheit-32)*5)/9;  

         System.out.println("Temperature in Celsius  is : "+ Celsius );





    }
}
