package Composite.src;

public class Scanner implements PrinterComponent {
    @Override
    public void operate(){
        System.out.println("Digitalizando documentos, aguarde . . .");
    }
}
