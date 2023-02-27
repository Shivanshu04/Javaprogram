import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Mainswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "mango":
            System.out.println("king of all fruits");
            break;
            case "apple":
            System.out.println("sweet red ftuits");
            break;
            case "orange":
            System.out.println("a round shape fruits");
            break;
             
            default:
            System.out.println("pelase enter valid fruits");
        }
    }
}
