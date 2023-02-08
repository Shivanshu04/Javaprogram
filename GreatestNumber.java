// wap to find greater among than three number
import java.util.Scanner;
public class GreatestNumber {
   

    public static void main(String args[]){
        int a,b,c;
    
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any three number");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is grater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
        else
        {
            if(b>c) 
            {
                System.out.println("b is greater");
            }
            else
            {
                System.out.println("c is greater");

            }
    }
    

   
}
}