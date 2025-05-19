package Assignment_04;

public class AllTypeMethod {

    private int num;
    private int num2;


    public AllTypeMethod( int num, int num2)
    {
        this.num=num;
        this.num2=num2;

    }

    public void PrintSum()
    {
        System.out.println("Sum: "+(num+num2));

    }

    public int getSubtraction(int a,int b)
    {
        return a-b;
    }

    public int getMultiplication(int c, int d)
    {
        return c*d;
    }

    public double getDivision(int e, int f)
    {
        return e/f;
    }

    public static void main(String[] args)
    {
       AllTypeMethod m=new AllTypeMethod(2,3);
       m.PrintSum();
       System.out.println("Subtraction: "+m.getSubtraction(8,5));
       System.out.println("Multiplication: "+m.getMultiplication(8,5));

       double div=m.getDivision(10,3);
       System.out.println("Division: "+div);



    }
}
