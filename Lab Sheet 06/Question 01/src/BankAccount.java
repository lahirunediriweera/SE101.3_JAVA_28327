public abstract class BankAccount
{
    // Input Data
    private int accountNumber;
    private double balance;

    //Add getter and setter method
    public void setAccountNumber(int a)
    {
        accountNumber = a;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public void setBalance(int b)
    {
        balance=b;
    }
    public double getBalance()
    {
        return balance;
    }
    abstract void calculateInterest();
}
