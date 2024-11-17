package Composite.src;

public class Printer implements PrinterComponent {
    @Override
    public void operate(){
        System.out.println("Imprimindo documentos, aguarde . . .");
    }
}
