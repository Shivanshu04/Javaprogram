import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <='z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("uppercase");
        }
    }
}
