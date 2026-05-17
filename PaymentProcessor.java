public class PaymentProcessor {
    public static void processPayment(double amount) {
        System.out.println("Processing payment of: " + amount * -1); // BUG!
    }

    public static void main(String[] args) {
        processPayment(100.0);
    }
}