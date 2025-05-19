package Assignment_02;

public class AssignmentOperator {

    public static void main(String[] args) {
        int num1 = 30, num2 = 20, num3=500;

        num1 += num2;
        System.out.println("addition: " + num1);

        num3 -= num1;
        System.out.println("subtraction: " + num3);

        num2 *= num3;
        System.out.println("multiplication: " + num2);

        num3 /= num1;
        System.out.println("division: " + num3);
    }
}
