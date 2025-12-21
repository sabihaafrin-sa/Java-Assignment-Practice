package Assignment_03;

public class MobileDataParam
{

    String BrandName;
    String Model;
    String color;
    int Price;

    public MobileDataParam()
    {

    }

    public MobileDataParam(String BrandName, String Model, String color, int Price)
    {
        this.BrandName=BrandName;
        this.Model=Model;
        this.color=color;
        this.Price=Price;
    }


    public void PrintBrandName()
    {
        System.out.println("Brand Name: "+BrandName);
    }

    public void PrintModel()
    {

        System.out.println("Model Name: "+Model);

    }

    public void PrintColor()
    {
        System.out.println("Color: "+color);
    }

    public void PrintPrice()
    {
        System.out.println("Price: "+Price);
    }

    public static void main(String[] args)
    {
        MobileDataParam md= new MobileDataParam();
        md.BrandName="Iphone";
        md.Model="16 Pro Max";
        md.color="Black";
        md.Price=150;
        System.out.println("Mobile Information: ");
        md.PrintBrandName();
        md.PrintModel();
        md.PrintColor();
        md.PrintPrice();

        System.out.println("Mobile Information Using Parameter: ");
        MobileDataParam md2=new MobileDataParam("Iphone", "15 Pro Max", "White", 200);
        md2.PrintBrandName();
        md2.PrintModel();
        md2.PrintColor();
        md2.PrintPrice();

    }


}
