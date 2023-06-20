public class Main
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        //Setter & Getter Method for Name
        e1.setName("Lahiru N Ediriweera");
        System.out.println("Name: "+e1.getName());

        //Setter & Getter Method for Age
        e1.setAge(23);
        System.out.println("Age: "+e1.getAge());

        //Setter & Getter Method for Salary
        e1.setSalary(25000);
        System.out.println("Salary: "+e1.getSalary());

        //Constructor part Display
        Employee2 e2=new Employee2("Ediri",22,54000);
        e2.display();
    }
}