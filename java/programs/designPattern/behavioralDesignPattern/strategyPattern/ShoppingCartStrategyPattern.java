package programs.designPattern.behavioralDesignPattern.strategyPattern;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid with credit card: " + amount);
    }
}

public class ShoppingCartStrategyPattern {
    private final PaymentStrategy paymentStrategy;

    public ShoppingCartStrategyPattern(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public static void main(String[] args) {
        ShoppingCartStrategyPattern cart = new ShoppingCartStrategyPattern(new CreditCardPayment());
        cart.checkout(100);
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}