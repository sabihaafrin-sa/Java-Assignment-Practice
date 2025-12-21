package Assignment_03;

public class StudentDataOBJ {

    int id;
    String name;
    String coursename;
    int mark;


    public void PrintData()
    {

        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Course Name: "+coursename);
        System.out.println("Mark: "+mark);


    }

    public static void main(String[] args)
    {
        StudentDataOBJ sd= new StudentDataOBJ();
        sd.id=12;
        sd.name="nadia";
        sd.coursename="math";
        sd.mark=90;
        System.out.println("First Student Data: ");

        sd.PrintData();

        StudentDataOBJ sd2= new StudentDataOBJ();
        sd2.id=8;
        sd2.name="faria";
        sd2.coursename="math";
        sd2.mark=99;
        System.out.println("Second Student Data: ");

        sd2.PrintData();



    }

}
