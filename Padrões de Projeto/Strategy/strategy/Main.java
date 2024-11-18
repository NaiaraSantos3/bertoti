package Strategy.strategy;

public class Main {
    public static void main(String[] args) {
        CellphonePromotion promotion = new CellphonePromotion();
        double cellphonePrice = 1200.00;

        // Pagamento via Boleto
        promotion.setPaymentStrategy(new BoletoPayment());
        promotion.checkout(cellphonePrice);

        // Pagamento via Cartão de Débito
        promotion.setPaymentStrategy(new DebitCardPayment());
        promotion.checkout(cellphonePrice);

        // Pagamento via Cartão de Crédito
        promotion.setPaymentStrategy(new CreditCardPayment());
        promotion.checkout(cellphonePrice);
    }
}
