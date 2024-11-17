package Composite.composite;

public class Main {
    public static void main(String[] args) {
        PrinterComponent scanner = new Scanner();
        PrinterComponent printer = new Printer();

        PrinterComposite composite = new PrinterComposite();
        composite.addComponent(scanner);
        composite.addComponent(printer);

        System.out.println("Operações da impressora:");
        composite.operate();
    }
}
