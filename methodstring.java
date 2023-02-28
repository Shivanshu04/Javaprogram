import java.lang.Thread.State;

public class methodstring {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting  = "hello my name is whoshivugupta";
        return greeting;
    }
}
