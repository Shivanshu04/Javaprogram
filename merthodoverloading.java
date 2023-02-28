public class merthodoverloading {
    public static void main(String[] args) {
        fun(45);
        fun("lol");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
}
