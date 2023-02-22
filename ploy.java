class Rectangle{
    int length ,width;
    void getdata(int x,int y)
    {
        length = x;
        width = y;

    }
    void React()
    {
        int result = length * width;
        System.out.println("Area="+result);
    }
}


public class ploy {
    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.getdata(10,30);
        ob.React();
        
    }
}
