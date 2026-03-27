import java.util.Scanner;

class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;
        boolean b = true;

        while (b) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.printf("Current Balance: "+balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Money Deposited Successfully.");
                    } else {
                        System.out.println("Invalid Amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient Balance...");
                    } else if (withdrawal <= 0) {
                        System.out.println("Invalid Amount.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Collect the Cash");
                    }
                    break;

                case 4:
                    System.out.println("Thank you");
                    b = false;
                    break;

                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }
    }
}
