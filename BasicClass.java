class Rectangle{
    int length,weight;
    void getdata(int x, int y)
    {
        length= x;
        weight = y;

    }
    void ReactArea()
    {
        int result=length * weight;
        System.out.println("area="+result);
    }
}
public class BasicClass {
    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.getdata(20,30);
        ob.ReactArea();

    }
}
