public class Item
{
    //Input Data
    private String Description;
    private int Location;

    //Setter Method for Description
    public void setDescription(String an)
    {
        Description=an;
    }
    //Getter Method for Location
    public String getDescription()
    {
        return Description;
    }

    //Setter Method for Location
    public void setLocation(int a)
    {
        Location=a;
    }
    //Getter Method for Location
    public int getLocation()
    {
        return Location;
    }

    //Input Methods
    public void setvalues(String an, int a)
    {
        Description=an;
        Location=a;
    }

    //No Parameter Constructor
    public Item()
    {
        Description="jkl";
        Location=123;
    }

    //Parameterized Constructor
    public Item(String an, int a)
    {
        Description=an;
        Location=a;
    }

    //Display Output
    public void displayd()
    {
        System.out.println("Description is: "+Description);
        System.out.println("Location is: "+Location);
    }
}
