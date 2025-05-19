package Assignment_03;

public class AllModifier {

    public String UniName;
    protected String Location;
    public int DeptNo;
    private int EstablishedYear;

    public AllModifier()
    {

    }

    public void PrintData()
    {
        System.out.println("Print University Data: ");
        System.out.println("University Name: "+UniName);
        System.out.println("University Location: "+Location);
        System.out.println("Number of Department: "+DeptNo);
        System.out.println("EstablishedYear: "+EstablishedYear);
    }

    public static void main(String[] args)

    {
        AllModifier m= new AllModifier();
        m.UniName="AIUB";
        m.Location="dhaka";
        m.DeptNo=4;
        m.EstablishedYear=1994;
        m.PrintData();

    }


}
