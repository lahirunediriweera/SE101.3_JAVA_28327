public class CheckingAccount extends BankAccount
{
    private static final double CHECKING_INTEREST_RATE=0.12;

    @Override
    public void calculateInterest()
    {
        double interest = getBalance()*CHECKING_INTEREST_RATE;

        System.out.println("Interest for saving account: "+interest);
    }
}
