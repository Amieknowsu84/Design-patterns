package main.creational.factory;

// Concrete Product: Spreadsheet Document
class SpreadsheetDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening spreadsheet document");
    }
}
