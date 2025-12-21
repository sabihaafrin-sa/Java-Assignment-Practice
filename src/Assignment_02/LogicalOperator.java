package Assignment_02;

public class LogicalOperator {

    public static void main(String[] args)
    {
        int num1=70, num2=80, num3=100, num4=60;

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("num3: "+num3);
        System.out.println("num4: "+num4);

        System.out.println("and operator");
        System.out.println("num1>num2 && num3<num4: "+(num1>num2 && num3==num4));


        System.out.println("or operator");
        System.out.println("num1>num4 && num2<num3: "+(num1==num4 || num2<num3));

    }
}
