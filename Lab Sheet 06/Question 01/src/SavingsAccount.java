public class SavingsAccount extends BankAccount
{
    private static final double SAVINGS_INTEREST_RATE=0.12;

    @Override
    public void calculateInterest()
    {
        double interest = getBalance()*SAVINGS_INTEREST_RATE;

        System.out.println("Interest for saving account: "+interest);
    }
}
