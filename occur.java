import java.util.Scanner;

public class occur {
    public static void main(String[] args) {
        
        int n = 4567889;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if (rem ==5);{
            count++;
            }
        }
        n = n/10;
        System.out.println(count);

    }
}
