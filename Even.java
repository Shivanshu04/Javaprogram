import java.util.Scanner;
public class Even {
    public static void main (String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the even/odd number");
        a = sc.nextInt();
        if (a%2==0)
        {
        System.out.println("Even Number"+a);
        }
        else
        {
            System.out.println("Odd no="+a);
        }
    
   
    }

}
