//wap to print table by using user input
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Table {
    public static void main(String[] args) {
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your Number");
        a= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*a);
        }
    }
}
