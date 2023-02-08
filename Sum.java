import java.util.Scanner;
public class Sum{


    public static void main(String args[])
    {
    int a,b,c;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the first number");
     a = Sc.nextInt();
    System.out.println("Enter the Second value");
    b = Sc.nextInt();
    c = a+b;
    System.out.println("Sum="+c);
    }
}
