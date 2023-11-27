import java.io.DataInputStream;

public class Swapvalue {
    public static void main(String[] args) throws Exception {
        int x,y;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter two Numbers");
        System.out.println("The value of x");
        x=Integer.parseInt(in.readLine());
        System.out.println("The value of y");
        y=Integer.parseInt(in.readLine());
        swapnumber(x,y);

    }

    public static void swapnumber(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("the value of x is "+x);
        System.out.println("the value of y is "+y);

    }
}
