import java.net.SocketTimeoutException;

public class shadowing {
    static int x=90;// this will be shadowed at  line 6

    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 40;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
