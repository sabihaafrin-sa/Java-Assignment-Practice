package Assignment_04;

public class DecisionMakingStatement {

    public static void main(String[] args)
    {
        int age=20;

        //1
        if(age>=18)
        {
            System.out.println("You are adult");
        }

        //2
        int num=10;
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }


        //3
        int number=89;
        if(number>=90 && number<=100)
        {
            System.out.println("Grade A");
        }
        else if(number>=80 && number<90)
        {
            System.out.println("Grade B");
        }
        else if(number>=70 && number<80)
        {
            System.out.println("Grade C");
        }
        else if(number>=60 && number<70)
        {
            System.out.println("Grade D");
        }
        else if(number>=0 && number<60)
        {
            System.out.println("Grade F");
        }
        else
        {
            System.out.println("Invalid");
        }

        //4

        int month=6;
        switch(month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");


        }
    }
}
