import java.util.Scanner;

import javax.xml.transform.Source;

public class primenumber {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        boolean ans =prime(n);
        System.out.println(prime(n));
    }
    static boolean prime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c <=n){
            if (n% c == 0){
                return false;
            }
            c++;
        }
        return c+c.n;

    }
}
