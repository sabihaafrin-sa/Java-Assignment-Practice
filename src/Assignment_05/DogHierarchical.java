package Assignment_05;

public class DogHierarchical extends AnimalHierarchical {

    String breed="Labrador";
    String name="Charlie";

    void dogInfo()
    {
        System.out.println("Dog");
        System.out.println("Species: "+species);
        System.out.println("Age: "+age);
        System.out.println("Breed: "+breed);
        System.out.println("Name: "+name);
    }

}
