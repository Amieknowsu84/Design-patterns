package main.solid.interfaceSegregation;

// Printer-only functionality for basic printers
class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
