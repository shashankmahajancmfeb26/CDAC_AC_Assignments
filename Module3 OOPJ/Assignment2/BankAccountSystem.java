class BankAccount {
    String accNo;
    String name;
    double balance;

    BankAccount() {
        this.accNo = "0000";
        this.name = "ABC";
        this.balance = 0.0;
    }

    BankAccount(String accNo, String userName, double initialBalance) {
        this.accNo = accNo;
        this.name = userName;
        this.balance = initialBalance;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accNo); 
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + balance);
    }
}
class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1101", "Sanket Pawar", 15000.00);
        BankAccount acc2 = new BankAccount("1102", "Jayashri Mahajan", 45500.50);
        BankAccount acc3 = new BankAccount("1103", "Diksha Mahajan", 5500.75);    
        
        System.out.println("===============Bank Account Details===============");
        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}
