//wap to print 1 to 100 only odd number
public class oddNumber {
    public static void main(String[] args) {
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your Number");
        a= sc.nextInt();
        for(int i=1;i<=100;i++){
            System.out.println(i*a);
        }
    }
}
