package Assignment_05;

public class ParentPolymorphism {

    void info()
    {
        System.out.println("this is parent class");
    }

    void eat()
    {
        System.out.println("Eats Rice and chicken");

    }


    //overload
    void eat(String food)
    {
        System.out.println("Eats "+food);

    }

    void eat(String food, int amount)
    {
        System.out.println("Eats "+food);
        System.out.println("Ammount "+amount);

    }

}
