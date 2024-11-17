package Composite.composite;

public class Scanner implements PrinterComponent {
    @Override
    public void operate(){
        System.out.println("Digitalizando documentos, aguarde . . .");
    }
}
