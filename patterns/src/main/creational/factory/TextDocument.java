package main.creational.factory;

// Concrete Product: Text Document
class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening text document");
    }
}
