package Composite.composite;

import java.util.ArrayList;
import java.util.List;

public class PrinterComposite implements PrinterComponent{
    private List<PrinterComponent> components = new ArrayList<>();

    public void addComponent(PrinterComponent component){
        components.add(component);
    }

    public void removeComponent(PrinterComponent component){
        components.remove(component);
    }

    @Override
    public void operate(){
        for (PrinterComponent component : components){
            component.operate();
        }
    }

}
