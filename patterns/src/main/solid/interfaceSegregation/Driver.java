package main.solid.interfaceSegregation;

public class Driver {
    public static void main(String[] args) {
        // All-in-one printer
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();

        // Basic printer
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();

        // Basic scanner
        BasicScanner basicScanner = new BasicScanner();
        basicScanner.scan();
    }
}
