import java.util.Scanner;

public class Evenodd{
    public static void main(String[]  reff) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number");
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Evem Number");
            
        }
        else
        System.out.println("odd Number");
        
    }
}