package main.creational.factory;

// Concrete Creator: Text Document Factory
class TextDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
