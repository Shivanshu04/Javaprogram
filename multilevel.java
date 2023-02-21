// Example of multilevel inheritance
class A{
    void display()
    {
        System.out.println("Show parent class");
    }
}
class B extends A{
    void show1() {
        System.out.println(" show Call class B");
    }
}
class C extends B{
    void show2() {
        System.out.println("Show Call Class C");
    }
}
public class multilevel {
    public static void main(String[] args) {
        C ob = new C();
        ob.display();
        ob.show1();
        ob.show2();
    }
}
