import java.util.*;

class Payment
{
    String paymentId;
    double amount;

    Payment(String paymentId, double amount)
    {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    void display() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: Rs. " + amount);
    }
}

class CreditCardPayment extends Payment
{
    String cardNo;

    CreditCardPayment(String id, double amt, String cardNo)
    {
        super(id, amt);
        this.cardNo = cardNo;
    }

    void display()
    {
        System.out.println("Credit Card ID: " + paymentId);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Card No.: " + cardNo);
    }
}

class UPIPayment extends Payment
{
    String upiId;

    UPIPayment(String id, double amt, String upiId)
    {
        super(id, amt);
        this.upiId = upiId;
    }

    void display()
    {
        System.out.println("UPI ID: " + paymentId); 
        System.out.println("Amount: Rs. " + amount);
        System.out.println("UPI ID: " + upiId);
    }
}
class PaymentProcessing
{
    public static void processPayments(List<? extends Payment> payments)
    {
        for (Payment p : payments) {
            p.display();
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args)
    {
        List<CreditCardPayment> CList = new ArrayList<>();
        CList.add(new CreditCardPayment("AB101", 7500.0, "XXXX-XXXX-8478"));
        CList.add(new CreditCardPayment("BC102", 10000.0, "XXXX-XXXX-1203"));

        List<UPIPayment> UList = new ArrayList<>();
        UList.add(new UPIPayment("152501201", 500.0, "sanket@okicici"));
        UList.add(new UPIPayment("152501202", 150.0, "shreya@hdfc"));
        
        System.out.println("======== Processing Credit Card Transactions ==========");
        processPayments(CList);

        System.out.println("======== Processing UPI Transactions ==========");
        processPayments(UList);
    }
}
