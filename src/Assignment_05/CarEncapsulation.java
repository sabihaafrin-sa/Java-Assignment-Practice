package Assignment_05;

public class CarEncapsulation {

    private String model;
    private int speed;

    public CarEncapsulation()
    {

    }

    public CarEncapsulation(String model, int speed)
    {
        this.model=model;
        this.speed=speed;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {

        this.model=model;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed=speed;
    }

    public void display()

    {
        System.out.println(" Car Model: "+model);
        System.out.println(" Car Speed: "+speed);
    }

    public static void main(String[] args)
    {
        CarEncapsulation car=new CarEncapsulation("Toyota", 200);
        car.display();

        car.setModel("BMW");
        car.setSpeed(200);
        System.out.println("Car Model: "+car.getModel());
        System.out.println("Car Speed: "+ car.getSpeed());

    }
}
