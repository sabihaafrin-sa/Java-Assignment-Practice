package Assignment_05;

public class CatHierarchical extends AnimalHierarchical {

    String breed="Persian";
    String name="Meeko";
    String color="Ash";


    void CatInfo()
    {
        System.out.println("Cat");
        System.out.println("Species: "+species);
        System.out.println("Age: "+age);
        System.out.println("Breed: "+breed);
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);

    }
}
