package Strategy.strategy;

public class CellphonePromotion {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy (PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Nenhuma estratégia de pagamento foi selecionada.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
