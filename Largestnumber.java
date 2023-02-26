import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        // find the  alargest among three number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your value");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b>max){
            max=b;

        }
        if (c>max){
            max=c;
        }
        System.out.println(max);
    }
}
