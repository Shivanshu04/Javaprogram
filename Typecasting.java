import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // type casting change float into int
        int sum = (int)(67.87f);
        System.out.println(sum);

        // Automatic type conversion
        int number = 'c';
        System.out.println(number);


    }    
}
