package Assignment_05;

public class MainPolymorphism {

    public static void main(String[] args) {

        ParentPolymorphism p=new ParentPolymorphism();
        p.info();
        p.eat();
        p.eat("Burger");
        p.eat("Pasta",200);


        ChildPolymorphism c= new ChildPolymorphism();
        c.info();



    }
}
