class A
{
    public void  Display()
    {
        System.out.println("Display Class");

    }
}
class B extends A
{
    void Show1(){
        System.out.println("Show Sub classb");

    }

}
class C extends A
{
    void Show2(){
        System.out.println("Show Sub class c");

    }

}
class D extends A
{
    void Show3(){
        System.out.println("Show Sub class D");

    }

}
public class hierachical {
    public static void main(String[] args) {
        B ob1 = new B();
        C ob2 = new C();
        D ob3= new D();
        ob1.Show1();
        ob1.Display();
        ob2.Show2();
        ob2.Display();
        ob3.Display();
        ob3.Show3();
        ob3.Display();
        
    }
}
