package main.creational.abstactFactory;

import java.util.List;

public class Driver {
    public static void main(String[] args){
        Company msi = new MsiManufacturer();

        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);
    }

}
