package Strategy.strategy;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void pay (double amount){
        System.out.println("Pagamento de R$" + amount + "realizado via Boleto.");
    }
}
