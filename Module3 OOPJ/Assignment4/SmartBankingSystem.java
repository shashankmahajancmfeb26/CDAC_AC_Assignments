import java.util.Scanner;

interface BankService
{
    void deposit(double amount);
    void deposit(double amount, double bonus);
    void withdraw(double amount) throws Exception;
}

class Account
{
    int accountNumber;
    String accountHolderName;
    double balance;

    public Account(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayAccountDetails()
    {
        System.out.println("\n-------------------------------------");    
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
    }
}

class SavingsAccount extends Account implements BankService
{
    public SavingsAccount(int accNo, String name, double bal) 
    {
        super(accNo, name, bal);
    }

    public void displayAccountDetails()
    {
        System.out.print("\nSavings Account");
        super.displayAccountDetails();
    }

    public void deposit(double amount)
    {
        if (amount < 0) throw new IllegalArgumentException("Invalid Amount");
        balance += amount;
    }

    public void deposit(double amount, double bonus)
    {
        if (amount < 0 || bonus < 0) throw new IllegalArgumentException("Values cannot Negative.");
        balance += (amount + bonus);
    }

    public void withdraw(double amount) throws Exception
    {
        if (amount < 0) throw new IllegalArgumentException("Invalid Amount");
        if (amount > balance) throw new Exception("Insufficient Balance.");
        balance -= amount;
    }
}

class CurrentAccount extends Account implements BankService
{
    public CurrentAccount(int accNo, String name, double bal)
    {
        super(accNo, name, bal);
    }

    public void displayAccountDetails()
    {
        System.out.print("\nCurrent Account");
        super.displayAccountDetails();
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }
    
    public void deposit(double amount, double bonus)
    {
        balance += (amount + bonus);
    }

    public void withdraw(double amount) throws Exception
    {
        if (amount > balance) throw new Exception("Overdraft not Permitted.");
        balance -= amount;
    }
}

public class SmartBankingSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter Account Number: ");
            int accNo = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Initial Balance: ");
            String bal = sc.nextLine();
            double initialBalance = Double.valueOf(bal);

            System.out.print("Choose Type: 1. Savings, 2. Current : ");
            int type = Integer.parseInt(sc.nextLine());

            Account acc;
            if (type == 1) acc = new SavingsAccount(accNo, name, initialBalance);
            else acc = new CurrentAccount(accNo, name, initialBalance);

            BankService service = (BankService) acc;

            System.out.print("Enter Amount to Deposit: ");
            service.deposit(Double.parseDouble(sc.nextLine()));

            System.out.print("Enter Amount to Withdraw: ");
            service.withdraw(Double.parseDouble(sc.nextLine()));

            StringBuilder summary = new StringBuilder();
            summary.append("\n----Account Details----\n");
            acc.displayAccountDetails();
            summary.append("Final Balance: Rs. ").append(acc.balance);
            System.out.println(summary.toString());

        } catch (NumberFormatException e)
        {
            System.out.println("Error: Invalid Number Format.");
        } catch (Exception e)
        {
            System.out.println("Transaction Error: " + e.getMessage());
        }
        
    }
}
