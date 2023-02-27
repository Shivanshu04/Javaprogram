import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId  = in.nextInt();
        String departement = in.next();
        switch(empId){
            case 1:
            System.out.println("Shivanshu Gupta");
            break;
            case 2:
            System.out.println("Shiv Gupta");
            break;
            case 3:
            System.out.println("Emp number");
            switch (departement){
                case "IT":
                System.out.println("IT Departemnt");
                break;
                case "Mangement":
                System.out.println("Mangement Departement");
                break;
                default:
                System.out.println("No department");

            }
            

        }
    }
}
