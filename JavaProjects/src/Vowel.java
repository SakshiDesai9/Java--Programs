import java.util.*;
public class Vowel
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
      
        char ch;
    
        System.out.println("Enter the Letter:");
        ch=sc.nextLine().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
    }
}

