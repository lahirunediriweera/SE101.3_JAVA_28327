public class Employee
{
    //Input Data
    private String Name;
    private int Age;
    private int Salary;

    //Input Methods
    //Setter & Getter Method for Name
    public void setName(String ab)
    {
        Name=ab;
    }
    public String getName()
    {
        return Name;
    }
    
    //Setter & Getter Method for Age
    public void setAge(int r)
    {
        Age=r;
    }
    public int getAge()
    {
        return Age;
    }

    //Setter & Getter Method for Salary
    public void setSalary(int w)
    {
        Salary=w;
    }
    public int getSalary()
    {
        return Salary;
    }

    //Display output
    public void display()
    {
        System.out.print("Name: "+Name);
        System.out.print("Age: "+Age);
        System.out.print("Salary: "+Salary);
    }
}
