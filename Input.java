import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll number");
        int rollno = input.nextInt();
        System.out.println("Your Roll Number is"+ rollno);
    }
    
}
