package Assignment_04;

public class LoopStatement
{
    public static void main(String[] args)
    {
        //for
        for(int i=1;i<=5;i++)
        {
            System.out.println("Increment for loop: "+i);
        }

        for(int j=5;j>0;j--)
        {
            System.out.println("Decrement for loop: "+j);
        }

        int[]number={1,2,3,4,5};
        for(int a:number)
        {
            System.out.println("Extended For Loop: "+a);
        }

        //while
        int b=1;
        while(b<=5)
        {
            System.out.println("While Loop: "+b);
            b++;
        }

        //do while

        int c=1;
        do
        {
            System.out.println("Do While Loop: "+c);
            c++;
        }while(c<=5);


    }
}
