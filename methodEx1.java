import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class methodEx1 {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }


    // return the value
    static int sum2(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first  value");
    int a = in.nextInt(0);
    System.out.println("enter the second value");
    int b = in.nextInt();
    int sum = a+b;
    return sum;
    }

    
}
