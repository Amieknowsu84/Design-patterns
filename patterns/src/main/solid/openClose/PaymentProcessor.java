package main.solid.openClose;

// Context class that uses the strategy
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        // Delegate payment to the selected strategy
        paymentStrategy.pay(amount);
    }
}
