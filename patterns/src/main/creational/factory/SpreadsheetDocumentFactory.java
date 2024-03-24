package main.creational.factory;

// Concrete Creator: Spreadsheet Document Factory
class SpreadsheetDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new SpreadsheetDocument();
    }
}
