import java.lang.*;
public class Array_5
{
    public static void main(String[]args)
    {
        int Num[]=new int[5];

        //Display null array
        System.out.print("\n Value of Element 1:"+Num[0]);
        System.out.print("\n Value of Element 2:"+Num[1]);
        System.out.print("\n Value of Element 3:"+Num[2]);
        System.out.print("\n Value of Element 4:"+Num[3]);
        System.out.print("\n Value of Element 5:"+Num[4]);


        //initializing array element
        Num[1]=12;
        Num[0]=42;
        Num[3]=20;
        Num[4]=10;

        System.out.print("\n Display the changed value:\n");
        //displaying array with new values
        System.out.print("\n Value of Element 1:"+Num[0]);
        System.out.print("\n Value of Element 2:"+Num[1]);
        System.out.print("\n Value of Element 3:"+Num[2]);
        System.out.print("\n Value of Element 4:"+Num[3]);
        System.out.print("\n Value of Element 5:"+Num[4]);


    }
}
