package Strategy.strategy;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via Cartão de Débito.");
    }
}