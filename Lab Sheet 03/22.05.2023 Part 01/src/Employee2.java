public class Employee2
{
    //Input Data
    private String Name;
    private int Age;
    private int Salary;

    /*//Input Methods
    public void setValues(String ad,int s, int g)
    {
        Name=ad;
        Age=s;
        Salary=g;
    }*/

    //No Parameter Constructor
    public Employee2(String Name,int Age,int Salary)
    {
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;
    }

    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public int getSalary()
    {
        return Salary;
    }

    //Display output
    public void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Salary: "+Salary);
    }
}
