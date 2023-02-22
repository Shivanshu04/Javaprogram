import java.nio.channels.Pipe;

interface A{
    void display1();

}
interface B{
    void display2();    
}
class Test implements A,B{
    public void display1(){
        System.out.println("interface A");
    }
    public void display2(){
        System.out.println("interface B");
    }
}
class Multiinterface{
    public static void main(String[] args) {
        Test t=new Test();
        t.display1();
        t.display2();
    }
}