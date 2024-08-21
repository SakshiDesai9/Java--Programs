import java.util.*;


public class Single_Print 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Student Name : \t");
        String name=sc.nextLine();

        System.out.print("Enter Roll Number : \t");
        String roll=sc.nextLine();

        System.out.print("Enter Course : \t");
        String course=System.console().readLine();

        System.out.print("Enter City : \t");
        String city=System.console().readLine();


        System.out.println("\n Student Name : " +name+ "\n Roll Number: "+roll+ "\n Course: " +course+ "\n City: "+ city);


        
    }
    
}
