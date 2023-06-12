public class InterfaceImplemented implements MyFisrtInterface
{
    @Override
    public void display()
    {
        //x=20; Can't change this value, In interface file they already assign x as final value.
        System.out.println("The value of x is: "+x);
    }
}
