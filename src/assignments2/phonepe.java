package assignments2;

interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}
public class phonepe {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay();
        p2.pay();
    }
}
