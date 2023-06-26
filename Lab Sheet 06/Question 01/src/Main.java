import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Saving
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(10000);
        savingsAccount.calculateInterest();

        //Checking
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(5000);
        checkingAccount.calculateInterest();
    }
}