package main.solid.interfaceSegregation;

// Scanner-only functionality for scanners
class BasicScanner implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
