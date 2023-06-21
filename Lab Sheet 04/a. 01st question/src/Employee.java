public class Employee
{
    //Input Data
    private int empID;
    private String empName;
    private String empDesignation;

    // Set All Value in one code Setter Method:
    public void setDetails(int empID, String empName, String empDesignation)
    {
        this.empID=empID;
        this.empName=empName;
        this.empDesignation=empDesignation;
    }

    //Add Getter & Setter method
    public void setEmpID(int a)
    {
        empID=a;
    }
    public int getEmpID()
    {
        return empID;
    }
    public void setEmpName(String as)
    {
        empName=as;
    }
    public String getEmpName()
    {
        return empName;
    }
    public void setEmpDesignation(String ad)
    {
        empDesignation=ad;
    }
    public String getEmpDesignation()
    {
        return empDesignation;
    }
}
