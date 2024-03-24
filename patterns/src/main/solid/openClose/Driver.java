package main.solid.openClose;

// Client code
public class Driver {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Using CreditCardPayment strategy
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(100.00);

        // Using PayPalPayment strategy
        paymentProcessor.setPaymentStrategy(new PayPalPayment());
        paymentProcessor.processPayment(50.00);
    }
}
