abstract class Payment {
    abstract void pay(double amount);
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Card extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class NetBanking extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

public class MainPayment
 {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        Payment p3 = new NetBanking();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(3000);
    }
}