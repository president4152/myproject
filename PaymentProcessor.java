public class PaymentProcessor {
    public static void processPayment(double amount) {
        System.out.println("Processing payment of: " + amount);
    }

    public static void main(String[] args) {
        processPayment(100.0);
    }
}