public class Emp
{
    //Input Data
    private String Name;
    private float Bsalary,Bonus;

    //Input Method
    public void setValues(String as,float d,float s)
    {
        Name=as;
        Bsalary=d;
        Bonus=s;
    }
    //No Parameter Constructor
    public Emp()
    {
        Name="Bogdan";
        Bsalary=50000.0f;
        Bonus=10000.0f;
    }

    public void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Basic: "+Bsalary);
        System.out.println("Bonus: "+Bonus);
    }
}
