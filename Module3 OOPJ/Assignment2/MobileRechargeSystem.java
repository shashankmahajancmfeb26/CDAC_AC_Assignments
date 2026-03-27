import java.util.Scanner;

class MobileRechargeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        String mnum = sc.next();

        System.out.println("--- Available Recharge Plans ---");
        System.out.println("1. 199: 28 days validity");
        System.out.println("2. 399: 56 days validity");
        System.out.println("3. 599: 84 days validity");
        
        System.out.print("Enter Recharge Amount: ");
        int amt = sc.nextInt();

        String val;
        switch (amt) {
            case 199:
                val = "28 days";
                break;
            case 399:
                val = "56 days";
                break;
            case 599:
                val = "84 days";
                break;
            default:
                val = "Invalid Plan";
                break;
        }

        System.out.println("============Recharge Details==========");
        if (!val.equals("Invalid Plan")) {
            System.out.println("Mobile Number: "+mnum);
            System.out.println("Amount Paid  : Rs. "+amt);
            System.out.println("Validity     : "+val);
            System.out.println("Status       : Recharge Successful...");
        } else {
            System.out.println("Enter valid Plan");
        }
    }
}
