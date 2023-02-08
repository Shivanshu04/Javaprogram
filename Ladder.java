import java.util.Scanner;
public class Ladder {
    public static void main (String args[]){
        int a,b,c;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter any number");
    a=Sc.nextInt();
    b=Sc.nextInt();
    c=Sc.nextInt();

    if(a>b&&a>c);
    {
        System.out.println("a is greater");
    }
    else{
        if(b>a&&c>a);
        {
            System.out.println("b is grater");
        }
        else {
        System.out.println("C is greater");
        }
    }
    }
}
