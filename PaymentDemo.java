abstract class Payment {
    abstract void processPayment(double amount);
}

class UPI extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount);
    }
}

class CreditCard extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs. " + amount);
    }
}

class NetBanking extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing Net Banking payment of Rs. " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();

        p1.processPayment(1000);
        p2.processPayment(2500);
        p3.processPayment(5000);
    }
}