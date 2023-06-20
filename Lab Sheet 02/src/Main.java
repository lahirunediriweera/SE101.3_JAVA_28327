public class Main
{
    public static void main(String[] args)
    {
        //No Parameter Constructor
        //Item i1=new Item();
        //i1.display();

        //Parameterized Constructor
        Monster i1=new Monster("Colombo",789456);
        i1.displayd();
        i1.input("Hambantota", 1453);
        i1.display();

        //Setter Method for Description
        i1.setDescription("Galle");
        //Getter Method for Description
        System.out.println("Description: "+i1.getDescription());

        //Setter Method for Location
        i1.setLocation(415996);
        //Getter Method for Location
        System.out.println("Location: "+i1.getLocation());
    }
}