package main.creational.factory;

public class Driver {
    public static void main(String[] args) {
        // Create a text document using the text document factory
        DocumentFactory textFactory = new TextDocumentFactory();
        Document textDocument = textFactory.createDocument();
        textDocument.open(); // Output: Opening text document

        // Create a spreadsheet document using the spreadsheet document factory
        DocumentFactory spreadsheetFactory = new SpreadsheetDocumentFactory();
        Document spreadsheetDocument = spreadsheetFactory.createDocument();
        spreadsheetDocument.open(); // Output: Opening spreadsheet document
    }
}

