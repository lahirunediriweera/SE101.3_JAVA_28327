public class TestClass
{
    public static void main(String[]args)
    {
        Employee e1=new Employee();
        e1.setDetails(100, "Bogdan", "Software Engineer");

        Employee e2=new Employee();
        e2.setDetails(200, "Bird", "Network Engineer");

        System.out.println("Employee ID: "+e1.getEmpID());
        System.out.println("Employee Name: "+e1.getEmpName());
        System.out.println("Employee Designation: "+e1.getEmpDesignation() + "\n");

        System.out.println("Employee ID: "+e2.getEmpID());
        System.out.println("Employee Name: "+e2.getEmpName());
        System.out.println("Employee Designation: "+e2.getEmpDesignation());



    }
}
