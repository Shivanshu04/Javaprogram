// single inheritance Class Example
class A
{
    public void  Display()
    {
        System.out.println("Display Class");

    }
}
class B extends A
{
    void Show(){
        System.out.println("Show Sub class");

    }

}
public class  inheritance {
public static void main(String[] args) {
    B ob =new B();
    ob.Display();
    ob.Show();
}
}