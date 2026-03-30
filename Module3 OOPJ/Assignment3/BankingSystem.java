class BankAccount {
    int accNo;
    String name;
    double balance;
    static int totalAcc = 0;

    BankAccount(int accNo, String name, double balance) 
    {
        this.name = name;
        this.balance = balance;
        this.accNo = accNo;
        totalAcc++;
    }

    void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Cash Deposit: " + amount);
    }

    void deposit(double amount, String transId) {
        balance += amount;
        System.out.println("Online Deposit " + transId + ": " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance.....");
        } else {
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
        }
    }

    void displayAccount() {
        System.out.println("Acc No: " + accNo + "\tName: " + name + "\tBalance: " + balance);
    }

    static int getCount() {
        return totalAcc;
    }
}

class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount(1101,"Alice", 1000.0);
        accounts[1] = new BankAccount(1102,"Bob", 500.0);

        System.out.println("--- Transactions ---");
        
        accounts[0].deposit(10000.0);
        accounts[1].deposit(5000.0, "11101ACD02");
        accounts[0].withdraw(7000.0);
        accounts[1].withdraw(8000.0);

        System.out.println("\n--- Final Account Reports ---");
        for (int i = 0; i < BankAccount.getCount(); i++) {
            accounts[i].displayAccount();
        }
        System.out.println("\nTotal Accounts in System: " + BankAccount.getCount());
    }
}
