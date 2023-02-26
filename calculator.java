import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user
        int ans = 0;
        while(true){
            //Take the operator as  input
            System.out.println("Enter your operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-'|| op =='*'|| op =='/'||op =='%'){
                // take two numbers 
                System.out.print("Enter two numbers");
                int num1 = in.nextInt();
                int num2 =in.nextInt();
                if(op == '+'){
                    ans = num1+num2;

                }
                if(op == '-'){
                    ans = num1-num2;

                }
                if(op == '*'){
                    ans = num1*num2;

                }
                if(op == '/'){
                    if (num2 !=0){
                        ans = num1/num2;
                    }

                }
                if(op == '%'){
                    ans = num1%num2;

                }

            }else if (op =='x' || op =='X'){
                break;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
        
    }
}
