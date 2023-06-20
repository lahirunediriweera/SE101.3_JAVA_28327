public class Monster extends Item
{
    //Input Data
    private String SecDescription;
    private int SecLocation;

    //Input Methods
    public void input(String af, int l)
    {
        SecDescription=af;
        SecLocation=l;
    }

    //No parameter Constructor
    public Monster()
    {
        SecDescription="Hamabantota";
        SecLocation=145263;
    }

    //Display Output
    public void display()
    {
        System.out.println("Second Description: "+SecDescription);
        System.out.println("Second Location: "+SecLocation);
    }
}