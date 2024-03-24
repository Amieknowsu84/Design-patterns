package main.behavioral.command;

// Receiver interface
interface Editor {
    void type(String text);

    void copy();

    void cut();

    void paste();
}
