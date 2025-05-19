package Assignment_05;

public class StudentSingleInheritance extends PersonSingleInheritance {

    String studentID="15-34";
    String course="Math";


    void PrintDetails()
    {
        System.out.println("Her name is: "+name);
        System.out.println("Age: "+age);
        System.out.println("Student ID: "+studentID);
        System.out.println("Course name: "+course);

    }
}
