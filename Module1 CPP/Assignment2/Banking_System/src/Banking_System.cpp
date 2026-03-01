#include <iostream>
#include <string>
#include <iomanip>

class BankAccount {

    int accountNumber;
    std::string accountHolderName;
    double balance;

public:
    BankAccount(int accNum, std::string name, double initialBalance = 0.0): accountNumber(accNum), accountHolderName(name), balance(initialBalance) {}

    int getAccountNumber() const {
        return accountNumber;
    }
    std::string getAccountHolderName() const {
        return accountHolderName;
    }
    double getBalance() const {
        return balance;
    }
    void setAccountHolderName(const std::string& name) {
        accountHolderName = name;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            std::cout<<"Successfully deposited Rs."<<std::fixed<<std::setprecision(2)<<amount<<"."<<std::endl;
        } else {
            std::cout <<"Enter correct amount"<<std::endl;
        }
    }

    bool withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                std::cout <<"Successfully withdraw Rs."<<std::fixed<<std::setprecision(2)<<amount<<"."<< std::endl;
                return true;
            } else {
                std::cout<<"Insufficient Balance"<<std::endl;
                return false;
            }
        } else {
            std::cout<<"Enter correct amount."<<std::endl;
            return false;
        }
    }

    void displayAccountDetails() const {
        std::cout<<"--- Account Details ---"<<std::endl;
        std::cout<<"Account Number:    " <<accountNumber<<std::endl;
        std::cout<<"Account Holder:    " <<accountHolderName<<std::endl;
        std::cout<<"Current Balance: Rs." <<std::fixed<<std::setprecision(2)<<balance<<std::endl;
        std::cout<<"-----------------------"<<std::endl;
    }
};

int main() {
    BankAccount details(1001, "Sushant Patil", 1000.00);

    int ch;
    double amt;

    do {
        std::cout<<"--- Banking System Menu ---"<<std::endl;
        std::cout<<"1. Deposit money"<<std::endl;
        std::cout<<"2. Withdraw money"<<std::endl;
        std::cout<<"3. Display account details"<<std::endl;
        std::cout<<"4. Exit program"<<std::endl;
        std::cout<<"Enter your choice: ";
        std::cin>>ch;

        switch (ch) {
            case 1:
                std::cout<<"Enter amount to deposit: Rs.";
                std::cin>>amt;
                details.deposit(amt);
                break;
            case 2:
                std::cout<<"Enter amount to withdraw: Rs.";
                std::cin>>amt;
                details.withdraw(amt);
                break;
            case 3:
            	details.displayAccountDetails();
                break;
            case 4:
                std::cout<<"Exit"<<std::endl;
                break;
            default:
                std::cout<<"Invalid choice."<<std::endl;
        }
    } while (ch != 4);

    return 0;
}
